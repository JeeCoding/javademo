package com.huzh.behaviorpatterns.memento.demo1;

/**
 * @Auther: huzh
 * @Date: 2021/4/22 21:37
 * @Description: 发起人
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}
