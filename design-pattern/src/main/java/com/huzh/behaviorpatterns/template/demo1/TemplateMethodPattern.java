package com.huzh.behaviorpatterns.template.demo1;

/**
 * @author huzh
 * @Description http://c.biancheng.net/view/1376.html
 * @Date 2021.4.13 19:51
 */
public class TemplateMethodPattern {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}
