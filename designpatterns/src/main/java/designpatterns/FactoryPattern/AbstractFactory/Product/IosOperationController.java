package designpatterns.FactoryPattern.AbstractFactory.Product;

/**
 * Ios操作控制器
 */
public class IosOperationController implements OperationController {
    @Override
    public void control() {
        System.out.println("IosOperationController");
    }
}
