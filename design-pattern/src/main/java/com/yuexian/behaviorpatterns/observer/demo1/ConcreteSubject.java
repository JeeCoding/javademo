package com.yuexian.behaviorpatterns.observer.demo1;

/**
 * @author yuexian
 * @description 具体目标
 * @date 2021.4.14 18:37
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");
        observers.forEach(Observer::response);
    }
}
