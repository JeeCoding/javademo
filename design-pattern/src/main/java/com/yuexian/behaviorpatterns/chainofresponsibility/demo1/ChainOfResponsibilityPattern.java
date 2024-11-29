package com.yuexian.behaviorpatterns.chainofresponsibility.demo1;

/**
 * @author yuexian
 * @date 2021.3.26 12:34
 * 例子：http://c.biancheng.net/view/1383.html
 */
public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}
