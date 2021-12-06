package designPatterns.strategy;

import designPatterns.strategy.Pen.BallPen;
import designPatterns.strategy.Pen.InkPen;
import designPatterns.strategy.Pen.Pen;
import designPatterns.strategy.RefillingStrategy.CartridgeChangeRefilling;
import designPatterns.strategy.RefillingStrategy.IRefillingStrategy;
import designPatterns.strategy.RefillingStrategy.InkFillingRefilling;

public class Client {
    public static void main(String[] args) {
        IRefillingStrategy cartridgeChangeRefilling = new CartridgeChangeRefilling();
        Pen ballPen = new BallPen(cartridgeChangeRefilling);
        ballPen.write();
        ballPen.refill();

        IRefillingStrategy inkFillingRefilling = new InkFillingRefilling();
        Pen inkPen = new InkPen(inkFillingRefilling);
        inkPen.write();
        inkPen.refill();
    }
}
