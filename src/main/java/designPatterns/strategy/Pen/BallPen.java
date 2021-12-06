package designPatterns.strategy.Pen;

import designPatterns.strategy.RefillingStrategy.IRefillingStrategy;

public class BallPen extends Pen{
    /**
     * As There is no default constructor available in 'designPatterns.strategy.Pen.Pen'
     * We are required to crate a similar constructor in child class
     * which will be used to instantiate the concrete child class
     */
    public BallPen(IRefillingStrategy refillingStrategy) {
        super(refillingStrategy);
    }

    @Override
    public void refill() {
        /**
         * We can observe that refillingStrategy is no where defined in child class
         * and is being inherited from parent class
         */
        refillingStrategy.refill();
    }

    /**
     * As no BallPen write behaviour will be similar to other pen's
     * There is no need to take this out as strategy
     */
    @Override
    public void write() {
        System.out.println("Writing Like a BallPen");
    }
}
