package OOD.ShoppingCart.Cart;

import OOD.ShoppingCart.Entity.Product;
import OOD.ShoppingCart.Entity.ProductCategory;
import OOD.ShoppingCart.Inventory.Catalog;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingCartTest {
    Catalog catalog = new Catalog();

    //IInventory inventory  = new Inventory(catalog);
    @BeforeEach
    public void setup() {
        catalog.addProduct(new Product.Builder().withID("1").withName("Book-OOPS").withPrice(200).withCategory(ProductCategory.BOOK).build());
        catalog.addProduct(new Product.Builder().withID("2").withName("Book-Python").withPrice(200).withCategory(ProductCategory.BOOK).build());
        catalog.addProduct(new Product.Builder().withID("3").withName("Book-Azure").withPrice(200).withCategory(ProductCategory.BOOK).build());


    }

    @Test
    public void add_one_item_to_cart() {
        Product product = catalog.lookUp("Book-OOPS");
        ICart cart = new ShoppingCart();
        cart.addItem(product);
        assertEquals(1, cart.getTotalItems());
    }

    @Test
    public void add_two_item_to_cart(){
        Product product = catalog.lookUp("Book-Azure");
        ICart cart = new ShoppingCart();
        cart.addItem(product);
        cart.updateQuantity(product, 1);
        assertEquals(2, cart.getTotalItems());
    }

    @Test
    public void remove_item_from_cart(){
        Product product = catalog.lookUp("Book-Azure");
        ICart cart = new ShoppingCart();
        cart.addItem(product);
        cart.removeItem(product.getName());
        assertEquals(0, cart.getTotalItems());
    }
    @Test
    public void getTotalOfCart(){
        Product product = catalog.lookUp("Book-Azure");
        ICart cart = new ShoppingCart();
        cart.addItem(product);
        cart.updateQuantity(product, 1);
        assertEquals(400, cart.calculateTotal());
    }


}