package com.huzh.behaviorpatterns.observer.demo5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huzh
 * @description
 * @date 2021.4.16 17:28
 */
public class Subject {

    private final List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        observers.forEach(Observer::update);
    }
}
