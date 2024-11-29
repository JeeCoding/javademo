package com.yuexian.behaviorpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: YueXian
 * @date: 2024/6/24 15:26
 * 观察者模式 + 回调函数：
 * 使用回调函数实现观察者模式，简化事件通知机制。
 */
public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void notifyObservers(String event) {

        //对event进行处理


        //进行循环回调
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}
