package com.huzh.behaviorpatterns.command.demo3;

/**
 * @author huzh
 * @description
 * @date 2021.4.14 15:37
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
