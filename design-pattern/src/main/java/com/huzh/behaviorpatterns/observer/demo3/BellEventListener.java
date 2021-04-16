package com.huzh.behaviorpatterns.observer.demo3;

import java.util.EventListener;

/**
 * @author huzh
 * @description 抽象观察者类：铃声事件监听器
 * @date 2021.4.16 14:16
 */
public interface BellEventListener extends EventListener {
    //事件处理方法，听到铃声
    public void heardBell(RingEvent e);
}