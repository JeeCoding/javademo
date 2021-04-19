package com.huzh.behaviorpatterns.mediator.demo1;

/**
 * @author huzh
 * @description
 * @date 2021.4.16 18:35
 */
public class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
