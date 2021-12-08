package designPatterns.singleton.SingletonCreator;

import designPatterns.singleton.singletonEntity.SingletonNonThreadSafe;

public class SingletonNonTSafeObjectCreator implements Runnable{
    @Override
    public void run() {
        SingletonNonThreadSafe singletonNonThreadSafe = null;
        try {
            singletonNonThreadSafe = SingletonNonThreadSafe.getSingletonNonThreadSafe();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Singleton Object is created with hashCode : " + singletonNonThreadSafe.hashCode());

    }
}
