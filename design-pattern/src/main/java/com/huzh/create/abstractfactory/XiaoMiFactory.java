package com.huzh.create.abstractfactory;

/**
 * @author: YueXian
 * @date: 2024/6/27 19:19
 */
public class XiaoMiFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Car createCar() {
        return new XiaoMiCar();
    }
}
