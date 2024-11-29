package com.yuexian.behaviorpatterns.chainofresponsibility.demo1;

/**
 * @author yuexian
 * @date 2021.3.26 12:27
 * 抽象处理者角色
 */
public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }


    //处理请求的方法
    public abstract void handleRequest(String request);
}
