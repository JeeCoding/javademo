package com.yuexian.behaviorpatterns.visitor.demo2;

/**
 * @author yuexian
 * @description
 * @date 2021.4.22 17:02
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
