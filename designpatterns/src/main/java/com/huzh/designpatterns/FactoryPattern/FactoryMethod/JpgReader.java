package com.huzh.designpatterns.FactoryPattern.FactoryMethod;

/**
 * 创建Jpg图片加载器类
 */
public class JpgReader implements Reader {
    public void read() {
        System.out.println("read jpg");
    }
}
