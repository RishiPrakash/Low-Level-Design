package designPatterns.decorator;

import designPatterns.decorator.Items.Coffee;
import designPatterns.decorator.Items.Item;
import designPatterns.decorator.decoraterItem.Hazelnut;
import designPatterns.decorator.decoraterItem.Latte;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        makeMeCoffee();
    }

    static void makeMeCoffee() {
        Item coffee = new Coffee();
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("****Please Choose you add ons****");
        System.out.println("Do you need a latte? Enter Y for Yes and N for No");
        if ("Y".equalsIgnoreCase(sc.next())) {
            coffee = new Latte(coffee);
        }
        System.out.println("Do you need a HazelNut? Enter Y for Yes and N for No");
        if ("Y".equalsIgnoreCase(sc.next())) {
            coffee = new Hazelnut(coffee);
        }
        System.out.println("You need to Pay : " + coffee.cost());
    }
}
