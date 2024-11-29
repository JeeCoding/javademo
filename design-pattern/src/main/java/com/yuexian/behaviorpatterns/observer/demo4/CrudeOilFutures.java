package com.yuexian.behaviorpatterns.observer.demo4;

import java.util.Observer;

/**
 * @author yuexian
 * @description
 * @date 2021.4.16 16:00
 */
public class CrudeOilFutures {
    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        Observer bull = new Bull(); //多方
        Observer bear = new Bear(); //空方
        oil.addObserver(bull);
        oil.addObserver(bear);
        oil.setPrice(10);
        oil.setPrice(-8);
    }
}
