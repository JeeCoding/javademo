package com.huzh.behaviorpatterns.strategy.demo1;

/**
 * @author huzh
 * @date 2021.3.29 12:45
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
