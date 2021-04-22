package com.huzh.behaviorpatterns.interpreter.demo3;

/**
 * @author huzh
 * @date 2021/4/22 22:35
 * @description
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
