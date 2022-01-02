package OOD.ShoppingCart.Cart;

import OOD.ShoppingCart.Entity.Item;
import OOD.ShoppingCart.Entity.Product;

public interface ICart {
    void addItem(Product product);
    void removeItem(String itemID);
    void updateQuantity(Product product, int quantity);
    double calculateTotal();
    void applyDiscount(double discount);
    void clearCart();
    int getTotalItems();
}
