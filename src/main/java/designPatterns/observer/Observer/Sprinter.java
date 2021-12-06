package designPatterns.observer.Observer;

public class Sprinter implements IGunShotObserver{
    String name;

    public Sprinter(String name){
        this.name =  name;
    }

    @Override
    public void takeAction() {
        System.out.println(this.hashCode() + " Starts Running!!");
    }
}
