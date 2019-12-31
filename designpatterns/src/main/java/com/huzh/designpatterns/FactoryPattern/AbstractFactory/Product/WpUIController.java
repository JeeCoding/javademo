package com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product;

/**
 * Wp界面控制器
 */
public class WpUIController implements UIController {
    @Override
    public void display() {
        System.out.println("WpInterfaceController");
    }
}
