package designPatterns.strategy.RefillingStrategy;

/*
* Because it is possible that some subclasses of pens have same Refilling behaviour
* Intersection of implementation of behaviour is possible
* hence better to take the behaviour out in strategy
* */
public interface IRefillingStrategy {
    void refill();
}
