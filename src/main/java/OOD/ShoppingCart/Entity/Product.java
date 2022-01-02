package OOD.ShoppingCart.Entity;

public class Product {


    private final String ID;
    private final ProductCategory category;
    private final double price;
    private final String name;

    private Product(Builder builder) {
        this.ID = builder.ID;
        this.category = builder.category;
        this.price = builder.price;
        this.name = builder.name;
    }

    public String getID() {
        return ID;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private String ID;
        private ProductCategory category;
        private double price;
        private String name;

        public Builder withID(String ID) {
            this.ID = ID;
            return this;
        }

        public Builder withCategory(ProductCategory category) {
            this.category = category;
            return this;
        }

        public Builder withPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

    }

}
