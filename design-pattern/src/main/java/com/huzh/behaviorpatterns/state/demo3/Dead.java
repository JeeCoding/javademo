package com.huzh.behaviorpatterns.state.demo3;

/**
 * @author huzh
 * @description
 * @date 2021.4.14 16:34
 */
public class Dead extends ThreadState {
    public Dead() {
        stateName = "死亡状态";
        System.out.println("当前线程处于：死亡状态.");
    }
}
