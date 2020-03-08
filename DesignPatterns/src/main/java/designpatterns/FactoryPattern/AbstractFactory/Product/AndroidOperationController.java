package designpatterns.FactoryPattern.AbstractFactory.Product;

/**
 * Android操作控制器
 */
public class AndroidOperationController implements OperationController {
    @Override
    public void control() {
        System.out.println("AndroidOperationController");
    }
}
