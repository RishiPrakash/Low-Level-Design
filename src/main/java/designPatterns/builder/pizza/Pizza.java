package designPatterns.builder.pizza;

public class Pizza {
    private  boolean extraCheese;
    private  String nameOfPizza;
    private  String base;
    private  String size;
    private  String veggies;

    private Pizza() {

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
        private Pizza pizza = new Pizza();

        public builder setExtraCheese(boolean extraCheese) {
            this.pizza.extraCheese = extraCheese;
            return this;
        }

        public builder setNameOfPizza(String nameOfPizza) {
            this.pizza.nameOfPizza = nameOfPizza;
            return this;
        }

        public builder setBase(String base) {
            this.pizza.base = base;
            return this;
        }

        public builder setSize(String size) {
            this.pizza.size = size;
            return this;
        }

        public builder setVeggies(String veggies) {
            this.pizza.veggies = veggies;
            return this;
        }

        Pizza build() {
          return isValid() ? this.pizza : null;
        }

        boolean isValid() {
            return this.pizza.nameOfPizza.length() > 0;
        }

    }
}
