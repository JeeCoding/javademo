package com.huzh.behaviorpatterns.visitor.demo1;

/**
 * @author huzh
 * @description 具体元素B类
 * @date 2021.4.22 16:44
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体元素B的操作。";
    }
}
