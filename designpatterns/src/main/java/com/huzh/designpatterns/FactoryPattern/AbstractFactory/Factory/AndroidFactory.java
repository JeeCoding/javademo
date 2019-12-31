package com.huzh.designpatterns.FactoryPattern.AbstractFactory.Factory;

import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.AndroidOperationController;
import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.AndroidUIController;
import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.OperationController;
import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.UIController;

public class AndroidFactory implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public UIController createInterfaceController() {
        return new AndroidUIController();
    }
}
