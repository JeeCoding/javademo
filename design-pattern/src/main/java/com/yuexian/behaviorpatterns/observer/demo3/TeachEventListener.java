package com.yuexian.behaviorpatterns.observer.demo3;

/**
 * @author yuexian
 * @description 具体观察者类：老师事件监听器
 * @date 2021.4.16 14:24
 */
public class TeachEventListener implements BellEventListener {
    @Override
    public void heardBell(RingEvent e) {
        if (e.getSound()) {
            System.out.println("老师上课了...");
        } else {
            System.out.println("老师下课了...");
        }
    }
}