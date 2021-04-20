package com.huzh.behaviorpatterns.iterator.demo1;

/**
 * @author huzh
 * @description 抽象聚合
 * @date 2021.4.20 15:30
 */
public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}
