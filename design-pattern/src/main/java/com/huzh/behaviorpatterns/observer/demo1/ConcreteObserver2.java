package com.huzh.behaviorpatterns.observer.demo1;

/**
 * @author huzh
 * @description 具体观察者2
 * @date 2021.4.14 18:36
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}
