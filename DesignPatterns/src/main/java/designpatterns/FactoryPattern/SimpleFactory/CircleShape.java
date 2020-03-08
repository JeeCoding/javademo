package designpatterns.FactoryPattern.SimpleFactory;

/**
 * 创建一个圆形类
 */
public class CircleShape implements Shape {

    public CircleShape() {
        System.out.println("CircleShape: created");
    }

    public void draw() {
        System.out.println("draw: CircleShape");
    }
}
