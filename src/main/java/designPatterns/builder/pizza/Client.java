package designPatterns.builder.pizza;

public class Client {
    public static void main(String[] args) {
        Pizza.builder builder = new Pizza.builder();

        Pizza pizza_italian = builder.setBase("Thin Crust").setExtraCheese(Boolean.TRUE)
                .setNameOfPizza("Italian").setSize("Regular").setVeggies("Capsicum").build();
        System.out.println("Received your order for : "+pizza_italian.getNameOfPizza()+" pizza");


        Pizza Veg_Pizza = builder.setVeggies("Corn").setNameOfPizza("Veggie Forest").build();
        System.out.println("Received your order for : "+Veg_Pizza.getNameOfPizza()+" pizza");


    }
}
