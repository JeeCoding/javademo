package com.huzh.behaviorpatterns.template.demo3;

/**
 * @author huzh
 * @Description TODO
 * @Date 2021.4.14 10:19
 */
public class HookTemplateMethod {
    public static void main(String[] args) {
        HookAbstractClass tm = new HookConcreteClass();
        tm.TemplateMethod();
    }
}
