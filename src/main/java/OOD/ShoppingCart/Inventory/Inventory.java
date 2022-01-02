package OOD.ShoppingCart.Inventory;

import OOD.ShoppingCart.Entity.Item;
import OOD.ShoppingCart.Entity.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory implements  IInventory{
    Map<String, Item> storage;
    Catalog catalog;
    public Inventory(Catalog catalog){
        this.catalog = catalog;
        storage  = new HashMap<>();
    }

    @Override
    public Item retriveItem(String name) {
        return storage.get(name);
    }

    @Override
    public void addItem(String name) {
        Product product = catalog.lookUp(name);
        Item item = storage.getOrDefault(product.getName(),new Item(product, 0));
        item.updateQunatity(1);
        storage.put(product.getName(), item);
    }

    @Override
    public void addItem(String name, int quantity) {
        Product product = catalog.lookUp(name);
        Item item = storage.getOrDefault(product.getName(),new Item(product, 0));
        item.updateQunatity(quantity);
        storage.put(product.getName(), item);
    }

    @Override
    public boolean isDeductionFeasible(String name) {
        /*
        * implement later
        * */
        return true;
    }
}
