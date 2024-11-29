package com.yuexian.behaviorpatterns.mediator.demo1;

/**
 * @author yuexian
 * @description 抽象同事类
 * @date 2021.4.16 18:28
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
