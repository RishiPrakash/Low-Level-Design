package OOD.ShoppingCart.Inventory;

import OOD.ShoppingCart.Entity.Item;
import OOD.ShoppingCart.Entity.Product;

public interface IInventory {
    Item retriveItem(String name);
    void addItem(String productName);
    void addItem(String productName, int quantity);
    boolean isDeductionFeasible(String name);
}
