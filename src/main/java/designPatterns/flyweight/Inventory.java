package designPatterns.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    List<Order> inventory = new ArrayList<>();
    Catalog catalog;
    public Inventory(Catalog catalog){
        this.catalog = catalog;
    }
    void takeOrder(String itemName){
        Item item = catalog.lookUp(itemName);
        inventory.add(new Order(item));
    }
    void processInventory(){
        inventory.forEach((e)->{
            System.out.println("Your order for item : "+e.getItem().getName()+" is being processed with orderID "+e.getID()+" with hashCode of Item Object :"+e.getItem().hashCode());
        });
    }



}
