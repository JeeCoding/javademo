package designpatterns.FactoryPattern.AbstractFactory.Factory;


import designpatterns.FactoryPattern.AbstractFactory.Product.IosOperationController;
import designpatterns.FactoryPattern.AbstractFactory.Product.IosUIController;
import designpatterns.FactoryPattern.AbstractFactory.Product.OperationController;
import designpatterns.FactoryPattern.AbstractFactory.Product.UIController;

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
