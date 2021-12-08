package designPatterns.singleton.SingletonCreator;

import designPatterns.singleton.singletonEntity.Singleton;

public class SingletonObjectCreator implements Runnable {

    @Override
    public void run() {
        Singleton instance = Singleton.getInstance();
        System.out.println("Singleton Object is created with hashCode : " + instance.hashCode());
    }
}
