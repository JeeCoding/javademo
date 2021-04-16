package com.huzh.behaviorpatterns.observer.demo5;

/**
 * @author huzh
 * @description
 * @date 2021.4.16 17:29
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
