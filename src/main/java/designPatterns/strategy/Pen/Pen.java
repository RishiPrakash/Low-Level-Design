package designPatterns.strategy.Pen;

import designPatterns.strategy.RefillingStrategy.IRefillingStrategy;

public abstract class Pen {
    String color;
    IRefillingStrategy refillingStrategy;

    public Pen(IRefillingStrategy refillingStrategy) {
        this.refillingStrategy = refillingStrategy;
    }
    abstract public void refill();
    abstract public void write();
}
