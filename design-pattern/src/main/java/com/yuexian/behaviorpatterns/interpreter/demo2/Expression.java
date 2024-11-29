package com.yuexian.behaviorpatterns.interpreter.demo2;

/**
 * @author: yuexian
 * @Date: 2021/4/22 22:24
 * @Description: 抽象表达式类
 */
public interface Expression {
    public boolean interpret(String info);
}
