package com.huzh.behaviorpatterns.state.demo5;

/**
 * @author huzh
 * @description
 * @date 2021.4.14 16:58
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
