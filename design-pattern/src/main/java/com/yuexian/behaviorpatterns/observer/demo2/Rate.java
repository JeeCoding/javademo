package com.yuexian.behaviorpatterns.observer.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuexian
 * @description 抽象目标：汇率
 * @date 2021.4.16 11:51
 */
public abstract class Rate {
    protected List<Company> companys = new ArrayList<>();

    //增加观察者方法
    public void add(Company company) {
        companys.add(company);
    }

    //删除观察者方法
    public void remove(Company company) {
        companys.remove(company);
    }

    public abstract void change(int number);

}
