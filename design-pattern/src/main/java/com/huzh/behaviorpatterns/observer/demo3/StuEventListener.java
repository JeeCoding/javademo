package com.huzh.behaviorpatterns.observer.demo3;

/**
 * @author huzh
 * @description 具体观察者类：学生事件监听器
 * @date 2021.4.16 14:25
 */
public class StuEventListener  implements BellEventListener {
    @Override
    public void heardBell(RingEvent e) {
        if (e.getSound()) {
            System.out.println("同学们，上课了...");
        } else {
            System.out.println("同学们，下课了...");
        }
    }
}