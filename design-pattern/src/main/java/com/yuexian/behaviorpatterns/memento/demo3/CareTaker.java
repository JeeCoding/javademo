package com.yuexian.behaviorpatterns.memento.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: yuexian
 * @Date: 2021/4/22 22:07
 * @Description:
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
