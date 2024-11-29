package com.yuexian.behaviorpatterns.interpreter.demo1;

/**
 * @Auther: yuexian
 * @Date: 2021/4/22 22:20
 * @Description: 抽象表达式类
 */
public interface AbstractExpression {
    public void interpret(String info);    //解释方法
}
