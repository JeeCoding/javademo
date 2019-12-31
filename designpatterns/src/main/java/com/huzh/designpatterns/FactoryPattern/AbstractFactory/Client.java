package com.huzh.designpatterns.FactoryPattern.AbstractFactory;

import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Factory.AndroidFactory;
import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Factory.IosFactory;
import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Factory.SystemFactory;
import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Factory.WpFactory;
import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.OperationController;
import com.huzh.designpatterns.FactoryPattern.AbstractFactory.Product.UIController;

public class Client {
    public static void main(String[] args) {
        SystemFactory mFactory;
        UIController interfaceController;
        OperationController operationController;

        //Android
        mFactory = new AndroidFactory();
        interfaceController = mFactory.createInterfaceController();
        operationController = mFactory.createOperationController();
        interfaceController.display();
        operationController.control();

        //Ios
        mFactory = new IosFactory();
        interfaceController = mFactory.createInterfaceController();
        operationController = mFactory.createOperationController();
        interfaceController.display();
        operationController.control();

        //Wp
        mFactory = new WpFactory();
        interfaceController = mFactory.createInterfaceController();
        operationController = mFactory.createOperationController();
        interfaceController.display();
        operationController.control();
    }
}
