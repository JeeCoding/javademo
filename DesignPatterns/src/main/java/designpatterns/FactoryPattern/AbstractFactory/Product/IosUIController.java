package designpatterns.FactoryPattern.AbstractFactory.Product;

/**
 * Ios界面控制器
 */
public class IosUIController implements UIController {
    @Override
    public void display() {
        System.out.println("IosInterfaceController");
    }
}
