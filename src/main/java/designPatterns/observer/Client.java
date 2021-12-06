package designPatterns.observer;

import designPatterns.observer.Observer.IGunShotObserver;
import designPatterns.observer.Observer.Sprinter;
import designPatterns.observer.Subject.ISubject;
import designPatterns.observer.Subject.RaceStarter;

public class Client {
    public static void main(String[] args) {
        ISubject raceStarter = new RaceStarter();

        IGunShotObserver sprinter_1 = new Sprinter("sprinter_1");
        IGunShotObserver sprinter_2 = new Sprinter("sprinter_2");
        IGunShotObserver sprinter_3 = new Sprinter("sprinter_3");

        raceStarter.addObserver(sprinter_1);
        raceStarter.addObserver(sprinter_2);
        raceStarter.addObserver(sprinter_3);
        System.out.println("Starting Race");
        raceStarter.update();
        System.out.println(" ");
        raceStarter.removeObserver(sprinter_1);
        System.out.println("Restarting Race");

        raceStarter.update();
    }
}
