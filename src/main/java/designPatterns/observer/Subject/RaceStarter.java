package designPatterns.observer.Subject;

import designPatterns.observer.Observer.IGunShotObserver;

import java.util.ArrayList;
import java.util.List;

public class RaceStarter implements ISubject {
    List<IGunShotObserver> allParticipants = new ArrayList<>();

    @Override
    public void addObserver(IGunShotObserver o) {
        allParticipants.add(o);
    }

    @Override
    public void removeObserver(IGunShotObserver o) {
        allParticipants.remove(o);
    }

    @Override
    public void update() {
        allParticipants.forEach((o) -> {
            o.takeAction();
        });
    }
}
