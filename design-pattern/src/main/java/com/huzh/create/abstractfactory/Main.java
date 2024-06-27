package com.huzh.create.abstractfactory;

/**
 * @author: YueXian
 * @date: 2024/6/27 20:00
 */
public class Main {
    public static void main(String[] args) {
        Factory xiaoMiFactory = new XiaoMiFactory();
        Factory huaWeiFactory = new HuaWeiFactory();

        Phone xiaoMiPhone = xiaoMiFactory.createPhone();
        Car xiaoMiCar = xiaoMiFactory.createCar();
        Phone huaWeiPhone = huaWeiFactory.createPhone();
        Car huaWeiCar = huaWeiFactory.createCar();

        xiaoMiPhone.call();
        xiaoMiCar.drive();
        huaWeiPhone.call();
        huaWeiCar.drive();
    }
}
