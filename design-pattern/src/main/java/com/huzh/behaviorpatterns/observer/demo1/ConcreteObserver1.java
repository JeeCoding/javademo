package com.huzh.behaviorpatterns.observer.demo1;

/**
 * @author huzh
 * @description 具体观察者1
 * @date 2021.4.14 18:35
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
