package com.huzh.behaviorpatterns.mediator.demo2;

/**
 * @author huzh
 * @description
 * @date 2021.4.20 12:17
 */
public class SimpleMediatorPattern {
    public static void main(String[] args) {
        SimpleColleague c1, c2;
        c1 = new SimpleConcreteColleague1();
        c2 = new SimpleConcreteColleague2();
        c1.send();
        System.out.println("-----------------");
        c2.send();
    }
}
