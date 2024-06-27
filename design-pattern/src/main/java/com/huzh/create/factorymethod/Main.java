package com.huzh.create.factorymethod;

/**
 * @author: YueXian
 * @date: 2024/6/27 15:36
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new XiaoMiFactory();
        Phone phone = factory.createPhone();
        phone.call();
    }
}
