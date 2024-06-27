package com.huzh.create.abstractfactory;

/**
 * @author: YueXian
 * @date: 2024/6/27 19:20
 */
public class HuaWeiFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Car createCar() {
        return new HuaWeiCar();
    }
}
