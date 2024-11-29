package com.yuexian.behaviorpatterns.state.demo4;

/**
 * @author yuexian
 * @description
 * @date 2021.4.14 16:44
 */
public class FlyweightStatePattern {
    public static void main(String[] args) {
        ShareContext context = new ShareContext(); //创建环境
        context.Handle(); //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
