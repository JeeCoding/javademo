package com.huzh.behaviorpatterns.mediator.demo3;

/**
 * @author huzh
 * @description
 * @date 2021.4.20 14:11
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
