package com.huzh.behaviorpatterns.command.demo3;

/**
 * @author huzh
 * @description
 * @date 2021.4.14 14:52
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + "," +
                "Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + "," +
                " Quantity: " + quantity + " ] sold");
    }
}
