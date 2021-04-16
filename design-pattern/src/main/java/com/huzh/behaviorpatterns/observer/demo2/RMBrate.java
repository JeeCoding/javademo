package com.huzh.behaviorpatterns.observer.demo2;

/**
 * @author huzh
 * @description
 * @date 2021.4.16 12:01
 */
public class RMBrate extends Rate {

    @Override
    public void change(int number) {
        companys.forEach(item -> item.response(number));
    }
}
