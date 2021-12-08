package designPatterns.singleton.singletonEntity;

public class SingletonNonThreadSafe {
    private static SingletonNonThreadSafe singletonNonThreadSafe = null;

    private SingletonNonThreadSafe() {
    }

    public static SingletonNonThreadSafe getSingletonNonThreadSafe() throws InterruptedException {
        if (singletonNonThreadSafe == null) {
            Thread.sleep(1000);
            singletonNonThreadSafe = new SingletonNonThreadSafe();
        }
        return singletonNonThreadSafe;
    }
}
