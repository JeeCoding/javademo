package com.yuexian.behaviorpatterns.observer.demo1;

/**
 * @author yuexian
 * @description
 * @date 2021.4.14 18:38
 */
public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer obs1 = new ConcreteObserver1();
        Observer obs2 = new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
    }
}
