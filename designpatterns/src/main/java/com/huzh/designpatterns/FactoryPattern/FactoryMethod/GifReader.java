package com.huzh.designpatterns.FactoryPattern.FactoryMethod;

/**
 * 创建Gif图片加载器类
 */
public class GifReader implements Reader {
    public void read() {
        System.out.println("read gif");
    }
}
