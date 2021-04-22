package com.huzh.behaviorpatterns.memento.demo3;

/**
 * @Auther: huzh
 * @Date: 2021/4/22 22:06
 * @Description:
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
