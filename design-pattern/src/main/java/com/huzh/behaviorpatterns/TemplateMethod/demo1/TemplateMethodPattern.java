package com.huzh.behaviorpatterns.TemplateMethod.demo1;

/**
 * @author huzh
 * @Description TODO
 * @Date 2021.4.13 19:51
 */
public class TemplateMethodPattern {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}
