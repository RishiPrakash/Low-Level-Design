package OOD.ShoppingCart.Entity;


public class Item {
    private int ID;
    private Product product;
    private int quantity;

    public Item(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }
    public void updateQunatity(int quantity){
        this.quantity+=quantity;
    }

    public int getID() {
        return ID;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
