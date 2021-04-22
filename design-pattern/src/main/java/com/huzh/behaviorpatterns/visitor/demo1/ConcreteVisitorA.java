package com.huzh.behaviorpatterns.visitor.demo1;

/**
 * @author huzh
 * @description 具体访问者A类
 * @date 2021.4.22 16:42
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者A访问-->" + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者A访问-->" + element.operationB());
    }
}
