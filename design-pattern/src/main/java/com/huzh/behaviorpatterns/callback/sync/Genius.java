package com.huzh.behaviorpatterns.callback.sync;

/**
 * @author: YueXian
 * @date: 2024/6/24 14:44
 */
public class Genius {

    public void answer(CallBack callBack) {
        System.out.println("在忙其他事。。。");

        try {
            Thread.sleep(2000);
            System.out.println("忙完其他事，开始计算。。。");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("天才计算出答案为：2");

        //回调告诉你
        callBack.callback("2");
    }

}
