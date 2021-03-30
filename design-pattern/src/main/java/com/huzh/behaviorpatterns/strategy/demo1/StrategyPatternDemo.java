package com.huzh.behaviorpatterns.strategy.demo1;

/**
 * @author huzh
 * @date 2021.3.29 12:46
 * 例子：https://www.runoob.com/design-pattern/strategy-pattern.html
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
