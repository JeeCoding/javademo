package com.yuexian.behaviorpatterns.state.demo2;

/**
 * @author yuexian
 * @description http://c.biancheng.net/view/1388.html
 * @date 2021.4.14 16:10
 */
public class ScoreStateTest {
    public static void main(String[] args) {
        ScoreContext account = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);
    }
}
