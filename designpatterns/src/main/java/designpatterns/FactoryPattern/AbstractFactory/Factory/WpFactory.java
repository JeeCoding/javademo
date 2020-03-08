package designpatterns.FactoryPattern.AbstractFactory.Factory;


import designpatterns.FactoryPattern.AbstractFactory.Product.OperationController;
import designpatterns.FactoryPattern.AbstractFactory.Product.UIController;
import designpatterns.FactoryPattern.AbstractFactory.Product.WpOperationController;
import designpatterns.FactoryPattern.AbstractFactory.Product.WpUIController;

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
