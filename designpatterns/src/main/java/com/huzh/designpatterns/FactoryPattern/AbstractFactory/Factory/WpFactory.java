package com.huzh.designpatterns.FactoryPattern.AbstractFactory.Factory;

import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.OperationController;
import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.UIController;
import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.WpOperationController;
import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.WpUIController;

public class WpFactory implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new WpOperationController();
    }

    @Override
    public UIController createInterfaceController() {
        return new WpUIController();
    }
}
