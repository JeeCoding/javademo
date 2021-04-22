package com.huzh.behaviorpatterns.memento.demo2;

/**
 * @Auther: huzh
 * @Date: 2021/4/22 21:59
 * @Description: 发起人原型
 */
public class OriginatorPrototype implements Cloneable {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public OriginatorPrototype createMemento() {
        return this.clone();
    }

    public void restoreMemento(OriginatorPrototype opt) {
        this.setState(opt.getState());
    }

    @Override
    public OriginatorPrototype clone() {
        try {
            return (OriginatorPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
