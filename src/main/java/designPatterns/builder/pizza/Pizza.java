package designPatterns.builder.pizza;

public class Pizza {
    private final boolean extraCheese;
    private final String nameOfPizza;
    private final String base;
    private final String size;
    private final String veggies;

    private Pizza(builder b) {
        this.base = b.base;
        this.nameOfPizza = b.nameOfPizza;
        this.extraCheese = b.extraCheese;
        this.size = b.size;
        this.veggies = b.veggies;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public String getNameOfPizza() {
        return nameOfPizza;
    }

    public String getBase() {
        return base;
    }

    public String getSize() {
        return size;
    }

    public String getVeggies() {
        return veggies;
    }

    static class builder {
        private boolean extraCheese;
        private String nameOfPizza;
        private String base;
        private String size;
        private String veggies;

        public builder setExtraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public builder setNameOfPizza(String nameOfPizza) {
            this.nameOfPizza = nameOfPizza;
            return this;
        }

        public builder setBase(String base) {
            this.base = base;
            return this;
        }

        public builder setSize(String size) {
            this.size = size;
            return this;
        }

        public builder setVeggies(String veggies) {
            this.veggies = veggies;
            return this;
        }

        Pizza build() {
            Pizza pizza = new Pizza(this);
            if (isValid()) {
                return pizza;
            }
            return null;
        }

        boolean isValid() {
            return this.nameOfPizza.length() > 0;
        }

    }
}
