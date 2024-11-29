package com.yuexian.behaviorpatterns.visitor.demo1;

/**
 * @author yuexian
 * @description 抽象访问者
 * @date 2021.4.22 16:41
 */
public interface Visitor {
    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}