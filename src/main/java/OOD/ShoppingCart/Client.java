package OOD.ShoppingCart;

import OOD.ShoppingCart.Cart.ICart;
import OOD.ShoppingCart.Cart.ShoppingCart;
import OOD.ShoppingCart.Entity.Product;
import OOD.ShoppingCart.Entity.ProductCategory;
import OOD.ShoppingCart.Inventory.Catalog;

public class Client {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.addProduct(new Product.Builder().withID("1").withName("Book-OOPS").withPrice(200).withCategory(ProductCategory.BOOK).build());
        catalog.addProduct(new Product.Builder().withID("2").withName("Book-Python").withPrice(200).withCategory(ProductCategory.BOOK).build());
        catalog.addProduct(new Product.Builder().withID("3").withName("Book-Azure").withPrice(200).withCategory(ProductCategory.BOOK).build());


        Product product = catalog.lookUp("Book-Azure");
        ICart cart = new ShoppingCart();
        cart.addItem(product);
        cart.removeItem(product.getName());
    }
}
