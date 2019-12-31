package com.huzh.designpatterns.FactoryPattern.SimpleFactory;

/**
 * 创建一个矩形类
 */
public class RectShape implements Shape {

    public RectShape() {
        System.out.println("RectShape: created");
    }

    public void draw() {
        System.out.println("draw: RectShape");
    }
}
