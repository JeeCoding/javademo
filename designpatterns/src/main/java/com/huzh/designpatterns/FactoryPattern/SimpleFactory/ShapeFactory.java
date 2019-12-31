package com.huzh.designpatterns.FactoryPattern.SimpleFactory;

/**
 * 创建图形工厂类
 */
public class ShapeFactory {
    public static final String TAG = "ShapeFactory";

    public static Shape getShape(String type) {
        Shape shape = null;
        if (type.equalsIgnoreCase("circle")) {
            shape = new CircleShape();
        } else if (type.equalsIgnoreCase("rect")) {
            shape = new RectShape();
        } else if (type.equalsIgnoreCase("triangle")) {
            shape = new TriangleShape();
        }
        return shape;
    }

    public static void main(String[] args) {
        Shape shape= ShapeFactory.getShape("circle");
        shape.draw();
    }
}
