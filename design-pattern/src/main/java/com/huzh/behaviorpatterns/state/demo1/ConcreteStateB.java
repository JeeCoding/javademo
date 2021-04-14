package com.huzh.behaviorpatterns.state.demo1;

/**
 * @author huzh
 * @description
 * @date 2021.4.14 15:55
 */
public class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}
