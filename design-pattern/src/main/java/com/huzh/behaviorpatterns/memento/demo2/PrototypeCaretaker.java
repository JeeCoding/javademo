package com.huzh.behaviorpatterns.memento.demo2;

/**
 * @Auther: huzh
 * @Date: 2021/4/22 22:00
 * @Description: 原型管理者
 */
public class PrototypeCaretaker {
    private OriginatorPrototype opt;

    public void setMemento(OriginatorPrototype opt) {
        this.opt = opt;
    }

    public OriginatorPrototype getMemento() {
        return opt;
    }
}
