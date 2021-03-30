package com.huzh.behaviorpatterns.strategy.demo1;

/**
 * @author huzh
 * @date 2021.3.29 12:45
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}