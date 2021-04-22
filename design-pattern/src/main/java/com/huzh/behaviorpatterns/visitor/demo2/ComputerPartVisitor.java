package com.huzh.behaviorpatterns.visitor.demo2;

/**
 * @author huzh
 * @description
 * @date 2021.4.22 17:04
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
