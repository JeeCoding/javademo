package com.huzh.behaviorpatterns.mediator.demo1;

/**
 * @author huzh
 * @description 抽象中介者
 * @date 2021.4.16 18:28
 */
public abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl); //转发
}
