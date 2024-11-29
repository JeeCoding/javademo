package com.yuexian.behaviorpatterns.template.demo1;

/**
 * @author yuexian
 * @Description TODO
 * @Date 2021.4.13 19:50
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}