package com.huzh.create.simplefactory;

/**
 * @author: YueXian
 * @date: 2024/6/27 15:42
 */
public class Factory {

    public Product createProduct(String arg) {
        if (arg.equals("a")) {
            return new XiaoMiProduct();
        } else if (arg.equals("b")) {
            return new HuaWeiProduct();
        }
        return null;
    }
}
