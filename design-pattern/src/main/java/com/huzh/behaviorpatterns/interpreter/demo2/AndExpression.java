package com.huzh.behaviorpatterns.interpreter.demo2;

/**
 * @author: huzh
 * @Date: 2021/4/22 22:24
 * @Description: 非终结符表达式类
 */
public class AndExpression implements Expression {
    private Expression city = null;
    private Expression person = null;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String s[] = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
