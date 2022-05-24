package observer;
import java.util.ArrayList;
import java.util.List;


//observable
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    abstract void setState(int state);

    abstract int getState();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}