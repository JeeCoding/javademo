package com.yuexian.behaviorpatterns.iterator.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuexian
 * @description 具体聚合
 * @date 2021.4.20 15:30
 */
public class ConcreteAggregate implements Aggregate {
    private final List<Object> list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}