package behavularpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer<Integer>> observers = new ArrayList<>();

    public void addObserver(Observer<Integer> observer) {
        observers.add(observer);
    }


    public void removeObserver(Observer<Integer> observer) {
        observers.remove(observer);
    }

    public void pushData(int data) {
        for (Observer<Integer> observer:observers) {
            observer.get(data);
        }
    }
}
