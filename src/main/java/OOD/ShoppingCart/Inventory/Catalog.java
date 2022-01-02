package OOD.ShoppingCart.Inventory;

import OOD.ShoppingCart.Entity.Product;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    Map<String, Product> catalog;

    public Catalog() {
        catalog = new HashMap<>();
    }

    public Product addProduct(Product product) {
        return catalog.put(product.getName(), product);
    }

    public Product removeProduct(String productName) {
        return catalog.remove(productName);
    }

    public Product lookUp(String name) {
        return catalog.get(name);
    }
}
