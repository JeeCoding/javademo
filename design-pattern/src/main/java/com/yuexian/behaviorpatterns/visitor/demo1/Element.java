package com.yuexian.behaviorpatterns.visitor.demo1;

/**
 * @author yuexian
 * @description 抽象元素类
 * @date 2021.4.22 16:41
 */
public interface Element {
    void accept(Visitor visitor);
}
