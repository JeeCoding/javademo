package com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product;

/**
 * Wp操作控制器
 */
public class WpOperationController implements OperationController {
    @Override
    public void control() {
        System.out.println("WpOperationController");
    }
}
