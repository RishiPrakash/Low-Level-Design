package designPatterns.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Inventory inventory = new Inventory(catalog);

        System.out.println("*****Please tell which items do you want to order as comma separated***");

        Scanner sc = new Scanner(System.in);
        String allOrders = sc.next();
        List<String> allOrdersAsList = new ArrayList<String>(Arrays.asList(allOrders.split(",")));
        for (String e : allOrdersAsList) {
            inventory.takeOrder(e);
        }
        inventory.processInventory();

    }
}
