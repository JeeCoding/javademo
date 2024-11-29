package com.yuexian.behaviorpatterns.iterator.demo1;

/**
 * @author yuexian
 * @description 抽象迭代器
 * @date 2021.4.20 15:30
 */
public interface Iterator {

    Object first();

    Object next();

    boolean hasNext();
}
