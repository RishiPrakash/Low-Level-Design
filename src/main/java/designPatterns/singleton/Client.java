package designPatterns.singleton;

import designPatterns.singleton.SingletonCreator.SingletonNonTSafeObjectCreator;
import designPatterns.singleton.SingletonCreator.SingletonObjectCreator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        initiateMultiPleThreadedModel_0();
        initiateMultiPleThreadedModel_1();
    }

    private static void initiateMultiPleThreadedModel_0() throws InterruptedException {
        System.out.println("******Trying for Non-ThreadSafe Singleton**********");

        ExecutorService executorService_0 = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 20; i++) {
            executorService_0.execute(new SingletonNonTSafeObjectCreator());
        }
        executorService_0.shutdown();
        executorService_0.awaitTermination(10, TimeUnit.SECONDS);
    }

    private static void initiateMultiPleThreadedModel_1() {

        System.out.println("******Trying for ThreadSafe Singleton**********");
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 20; i++) {
            executorService.execute(new SingletonObjectCreator());
        }
        executorService.shutdown();
    }
}
