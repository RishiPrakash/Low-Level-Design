package designPatterns.decorator.decoraterItem;

import designPatterns.decorator.Items.Item;

public class Latte implements Item {
    Item item;
    public Latte(Item item){
        this.item = item;
    }

    @Override
    public int cost() {
        return this.item.cost()+20;
    }
}
