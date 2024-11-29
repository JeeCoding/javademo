package com.yuexian.behaviorpatterns.state.demo5;

/**
 * @author yuexian
 * @description
 * @date 2021.4.14 16:57
 */
public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
}
