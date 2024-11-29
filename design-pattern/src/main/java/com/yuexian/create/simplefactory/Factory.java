package com.yuexian.create.simplefactory;

/**
 * @author: YueXian
 * @date: 2024/6/27 15:42
 */
public class Factory {

    public Phone createProduct(String arg) {
        if (arg.equals("a")) {
            return new XiaoMiPhone();
        } else if (arg.equals("b")) {
            return new HuaWeiPhone();
        }
        return null;
    }
}
