package com.huzh.designpatterns.ObserverPattern.demo1;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}