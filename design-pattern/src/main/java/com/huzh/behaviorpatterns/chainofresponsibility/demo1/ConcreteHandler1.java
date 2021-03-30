package com.huzh.behaviorpatterns.chainofresponsibility.demo1;

/**
 * @author huzh
 * @date 2021.3.26 12:30
 * 具体处理者角色1
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("one".equals(request)) {
            System.out.println("具体处理者1负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }

    }
}
