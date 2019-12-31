package com.huzh.designpatterns.FactoryPattern.AbstractFactory.Factory;

import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.OperationController;
import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.UIController;

public interface SystemFactory {
    public OperationController createOperationController();

    public UIController createInterfaceController();
}
