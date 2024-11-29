package com.yuexian.behaviorpatterns.visitor.demo1;

/**
 * @author yuexian
 * @description 具体访问者B类
 * @date 2021.4.22 16:43
 */
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者B访问-->" + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者B访问-->" + element.operationB());
    }
}
