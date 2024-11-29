package com.yuexian.create.factorymethod;

/**
 * @author: YueXian
 * @date: 2024/6/27 15:35
 */
public class XiaoMiFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new XiaoMIPhone();
    }
}
