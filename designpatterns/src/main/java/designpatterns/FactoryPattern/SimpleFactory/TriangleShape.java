package designpatterns.FactoryPattern.SimpleFactory;

/**
 * 创建一个三角形类
 */
public class TriangleShape implements Shape {

    public TriangleShape() {
        System.out.println("TriangleShape: created");
    }

    public void draw() {
        System.out.println("draw: TriangleShape");
    }
}
