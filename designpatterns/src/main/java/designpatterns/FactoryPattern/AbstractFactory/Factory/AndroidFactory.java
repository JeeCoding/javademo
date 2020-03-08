package designpatterns.FactoryPattern.AbstractFactory.Factory;


import designpatterns.FactoryPattern.AbstractFactory.Product.AndroidOperationController;
import designpatterns.FactoryPattern.AbstractFactory.Product.AndroidUIController;
import designpatterns.FactoryPattern.AbstractFactory.Product.OperationController;
import designpatterns.FactoryPattern.AbstractFactory.Product.UIController;

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
