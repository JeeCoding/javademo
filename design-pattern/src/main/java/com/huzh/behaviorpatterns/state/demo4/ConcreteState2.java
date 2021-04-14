package com.huzh.behaviorpatterns.state.demo4;

/**
 * @author huzh
 * @description 具体状态2类
 * @date 2021.4.14 16:43
 */
public class ConcreteState2 extends ShareState {
    @Override
    public void Handle(ShareContext context) {
        System.out.println("当前状态是： 状态2");
        context.setState(context.getState("1"));
    }
}
