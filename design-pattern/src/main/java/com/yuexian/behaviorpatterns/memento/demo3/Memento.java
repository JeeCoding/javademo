package com.yuexian.behaviorpatterns.memento.demo3;

/**
 * @Auther: yuexian
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
