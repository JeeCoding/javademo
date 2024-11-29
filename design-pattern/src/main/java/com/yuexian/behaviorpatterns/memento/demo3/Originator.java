package com.yuexian.behaviorpatterns.memento.demo3;

/**
 * @Auther: yuexian
 * @Date: 2021/4/22 22:07
 * @Description:
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }
}
