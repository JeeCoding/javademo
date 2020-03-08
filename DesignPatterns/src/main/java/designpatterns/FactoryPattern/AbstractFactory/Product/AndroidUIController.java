package designpatterns.FactoryPattern.AbstractFactory.Product;

/**
 * Android界面控制器
 */
public class AndroidUIController implements UIController {
    @Override
    public void display() {
        System.out.println("AndroidInterfaceController");
    }
}
