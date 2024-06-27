package com.huzh.create.factorymethod;

/**
 * @author: YueXian
 * @date: 2024/6/27 15:36
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new XiaoMiFactory();
        Product product = factory.factoryMethod();
        product.use();
    }
}
