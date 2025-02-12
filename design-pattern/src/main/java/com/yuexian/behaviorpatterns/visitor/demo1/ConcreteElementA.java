package com.yuexian.behaviorpatterns.visitor.demo1;

/**
 * @author yuexian
 * @description 具体元素A类
 * @date 2021.4.22 16:44
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素A的操作。";
    }
}
