package designPatterns.strategy.RefillingStrategy;

public class CartridgeChangeRefilling implements IRefillingStrategy{
    @Override
    public void refill() {
        System.out.println("Refilling by changing Cartridge");
    }
}
