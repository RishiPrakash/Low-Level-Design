package designPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Acts as a Item-Reference Factory
 * Caution : This returns same Item reference each time
 */
public class Catalog {
    Map<String, Item> catalog = new HashMap<>();

    Item lookUp(String itemName) {
        if (!catalog.containsKey(itemName)) {
            catalog.put(itemName, new Item(itemName));
        }
        return catalog.get(itemName);
    }

}
