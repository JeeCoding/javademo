package com.huzh.behaviorpatterns.observer.demo2;

/**
 * @author huzh
 * @description
 * @date 2021.4.16 12:04
 */
public class RMBrateTest {
    public static void main(String[] args) {
        Rate rate = new RMBrate();
        Company watcher1 = new ImportCompany();
        Company watcher2 = new ExportCompany();
        rate.add(watcher1);
        rate.add(watcher2);
        rate.change(10);
        rate.change(-9);
    }
}
