package designPatterns.strategy.RefillingStrategy;

public class InkFillingRefilling implements IRefillingStrategy{
    @Override
    public void refill() {
        System.out.println("Refilling by filling more ink");
    }
}
