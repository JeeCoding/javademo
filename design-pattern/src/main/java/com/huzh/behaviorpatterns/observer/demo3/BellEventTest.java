package com.huzh.behaviorpatterns.observer.demo3;

/**
 * @author huzh
 * @description
 * @date 2021.4.16 14:26
 */
public class BellEventTest {
    public static void main(String[] args) {
        BellEventSource bell = new BellEventSource();    //铃（事件源）
        bell.addPersonListener(new TeachEventListener()); //注册监听器（老师）
        bell.addPersonListener(new StuEventListener());    //注册监听器（学生）
        bell.ring(true);   //打上课铃声
        System.out.println("------------");
        bell.ring(false);  //打下课铃声
    }
}
