package com.yuexian.behaviorpatterns.strategy.demo2;

/**
 * @author yuexian
 * @date 2021.3.29 12:57
 * 具体策略类A
 */
class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
