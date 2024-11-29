package com.yuexian.behaviorpatterns.interpreter.demo1;

/**
 * @Auther: yuexian
 * @Date: 2021/4/22 22:21
 * @Description: 环境类
 */
public class Context {
    private AbstractExpression exp;

    public Context() {
        //数据初始化
    }

    public void operation(String info) {
        //调用相关表达式类的解释方法
    }
}
