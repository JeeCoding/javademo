package com.yuexian.behaviorpatterns.state.demo4;

/**
 * @author yuexian
 * @description 具体状态1类
 * @date 2021.4.14 16:43
 */
public class ConcreteState1 extends ShareState {
    @Override
    public void Handle(ShareContext context) {
        System.out.println("当前状态是： 状态1");
        context.setState(context.getState("2"));
    }
}