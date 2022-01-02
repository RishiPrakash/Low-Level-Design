package OOD.ShoppingCart.Cart;

import OOD.ShoppingCart.Entity.Item;
import OOD.ShoppingCart.Entity.Product;
import OOD.ShoppingCart.Inventory.IInventory;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart implements ICart {
    Map<String, Item> items;
    double discount;
    double totalCartValue;

    public ShoppingCart() {
        items = new HashMap<>();
        discount = 0;
        totalCartValue = 0;
    }

    public int getTotalItems(){
        int totalItems = 0;
        for(Item item : items.values()){
            totalItems +=item.getQuantity();
        }
        return totalItems;
    }

    @Override
    public void addItem(Product product) {
        Item item = items.getOrDefault(product.getName(), new Item(product, 0));
        item.updateQunatity(1);
        /*
        * Here we should lookup in inventory storage to see the feasibility and update also
        * */
        items.put(product.getName(), item);
    }

    @Override
    public void removeItem(String itemName) {
        /*
         * Here we should lookup in inventory storage to see the feasibility and update also
         * */
        items.remove(itemName);
    }

    @Override
    public void updateQuantity(Product product, int quantity) {
        Item item = items.getOrDefault(product.getName(), new Item(product, 0));
        item.updateQunatity(quantity);
        /*
         * Here we should lookup in inventory storage to see the feasibility and update also
         * */
        items.put(product.getName(), item);
    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for(Item item : items.values()){
            total += (item.getQuantity() * item.getProduct().getPrice());
        }
        return total-discount;
    }

    @Override
    public void applyDiscount(double discount) {
        this.discount = discount;
        calculateTotal();
    }

    @Override
    public void clearCart() {
        items.clear();
        this.discount = 0;
        this.totalCartValue = 0;
    }
}
