package com.huzh.behaviorpatterns.interpreter.demo3;

/**
 * @auther huzh
 * @date 2021/4/22 22:35
 * @description
 */
public interface Expression {
    boolean interpret(String context);
}
