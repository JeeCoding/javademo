package com.yuexian.behaviorpatterns.state.demo1;

/**
 * @author yuexian
 * @description
 * @date 2021.4.14 15:55
 */
public class ConcreteStateA extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}