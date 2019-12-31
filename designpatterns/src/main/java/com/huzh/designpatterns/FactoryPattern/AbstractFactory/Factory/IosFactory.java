package com.huzh.designpatterns.FactoryPattern.AbstractFactory.Factory;

import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.IosOperationController;
import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.IosUIController;
import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.OperationController;
import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.UIController;

public class IosFactory implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new IosOperationController();
    }

    @Override
    public UIController createInterfaceController() {
        return new IosUIController();
    }
}
