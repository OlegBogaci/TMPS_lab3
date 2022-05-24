package observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class Darwin extends Subject {

    private final Deque<Integer> stock = new ArrayDeque<>();

    public Darwin(){
        stock.add(20);
    }

    @Override
    void setState(int newStock) {
        stock.add(newStock);
        this.notifyObservers();
    }

    @Override
    int getState() {
        return stock.getLast();
    }
}