package com.huzh.designpatterns.AdapterPattern.ClassAdapter;

/**
 * 创建适配器
 * 优点：不能置换适配者的方法
 * 缺点：一个对象适配器可以把多个不同的适配者适配到同一个目标
 */
public class PowerAdapter extends PowerAdaptee implements PowerTarget {
    @Override
    public int output5V() {
        int output = output220V();
        System.out.println("电源适配器开始工作，此时输出电压是：" + output);
        output = output / 44;
        System.out.println("电源适配器工作完成，此时输出电压是：" + output);
        return output;
    }
}
