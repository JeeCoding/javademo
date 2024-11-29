package com.yuexian.behaviorpatterns.memento.demo1;

/**
 * @Auther: yuexian
 * @Date: 2021/4/22 21:39
 * @Description: 管理者
 */
public class Caretaker {
    private Memento memento;

    public void setMemento(Memento m) {
        memento = m;
    }

    public Memento getMemento() {
        return memento;
    }
}
