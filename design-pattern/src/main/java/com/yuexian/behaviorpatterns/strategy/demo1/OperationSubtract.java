package com.yuexian.behaviorpatterns.strategy.demo1;

/**
 * @author yuexian
 * @date 2021.3.29 12:44
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
