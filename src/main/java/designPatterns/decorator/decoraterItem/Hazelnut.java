package designPatterns.decorator.decoraterItem;

import designPatterns.decorator.Items.Item;

public class Hazelnut implements Item {
    Item item;
    public Hazelnut(Item item){
        this.item = item;
    }

    @Override
    public int cost() {
        return this.item.cost()+10;
    }
}
