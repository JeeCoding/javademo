package com.yuexian.behaviorpatterns.strategy.demo2;

/**
 * @author yuexian
 * @date 2021.3.29 12:58
 * 环境类
 */
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
