package com.yuexian.behaviorpatterns.state.demo5;

/**
 * @author yuexian
 * @description
 * @date 2021.4.14 16:57
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
