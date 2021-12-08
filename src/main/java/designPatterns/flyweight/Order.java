package designPatterns.flyweight;

public class Order {
    public static int IDGlobal = 0;
    private Item item;
    private int ID;

    public Order(Item item) {
        this.item = item;
        this.ID = IDGlobal++;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


}
