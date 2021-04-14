package com.huzh.behaviorpatterns.command.demo3;

/**
 * @author huzh
 * @description
 * @date 2021.4.14 14:51
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
