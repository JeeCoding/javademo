package com.yuexian.behaviorpatterns.observer.demo4;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yuexian
 * @description 具体观察者类：空方
 * @date 2021.4.16 15:58
 */
public class Bear implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Float price = (Float) arg;
        if (price > 0) {
            System.out.println("油价上涨" + price + "元，空方伤心了！");
        } else {
            System.out.println("油价下跌" + (-price) + "元，空方高兴了！");
        }
    }
}