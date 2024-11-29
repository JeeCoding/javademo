package com.yuexian.behaviorpatterns.memento.demo1;

/**
 * @Auther: yuexian
 * @Date: 2021/4/22 21:38
 * @Description: 备忘录
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
