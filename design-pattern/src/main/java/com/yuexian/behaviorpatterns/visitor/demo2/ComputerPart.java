package com.yuexian.behaviorpatterns.visitor.demo2;

/**
 * @author yuexian
 * @description
 * @date 2021.4.22 17:02
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
