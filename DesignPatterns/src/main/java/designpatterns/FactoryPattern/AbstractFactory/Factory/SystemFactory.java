package designpatterns.FactoryPattern.AbstractFactory.Factory;


import designpatterns.FactoryPattern.AbstractFactory.Product.OperationController;
import designpatterns.FactoryPattern.AbstractFactory.Product.UIController;

public interface SystemFactory {
    public OperationController createOperationController();

    public UIController createInterfaceController();
}
