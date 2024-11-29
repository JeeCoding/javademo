package com.yuexian.behaviorpatterns.observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuexian
 * @description 抽象目标
 * @date 2021.4.14 18:32
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    //增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }

    //删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver(); //通知观察者方法
}
