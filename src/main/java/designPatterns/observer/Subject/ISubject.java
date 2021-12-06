package designPatterns.observer.Subject;

import designPatterns.observer.Observer.IGunShotObserver;

public interface ISubject {

    void addObserver(IGunShotObserver o);
    void removeObserver(IGunShotObserver o);
    void update();
}
