package com.huzh.behaviorpatterns.interpreter.demo1;

/**
 * @Auther: huzh
 * @Date: 2021/4/22 22:21
 * @Description: 非终结符表达式类
 */
public class NonterminalExpression implements AbstractExpression {
    private AbstractExpression exp1;
    private AbstractExpression exp2;

    @Override
    public void interpret(String info) {
        //非对终结符表达式的处理
    }
}
