package com.huzh.behaviorpatterns.observer.demo4;

import java.util.Observable;

/**
 * @author huzh
 * @description 具体目标类：原油期货
 * @date 2021.4.16 15:54
 */
public class OilFutures extends Observable {

    private float price;

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        super.setChanged();  //设置内部标志位，注明数据发生变化
        super.notifyObservers(price);    //通知观察者价格改变了
        this.price = price;
    }
}