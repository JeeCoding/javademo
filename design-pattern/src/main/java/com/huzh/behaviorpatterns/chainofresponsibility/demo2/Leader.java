package com.huzh.behaviorpatterns.chainofresponsibility.demo2;

/**
 * @author huzh
 * @date 2021.3.26 12:43
 * 抽象处理者：领导类
 */
public abstract class Leader {
    private Leader next;

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }

    //处理请求的方法
    public abstract void handleRequest(int LeaveDays);
}
