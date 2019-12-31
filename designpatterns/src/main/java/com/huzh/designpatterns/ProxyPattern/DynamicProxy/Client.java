package com.huzh.designpatterns.ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
//        client.client1();
        client.client2();
    }


    public void client1() {
        Subject subject = new RealSubject("admin");
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler invocationHandler = new ProxySubject(subject);
        Subject proxy = (Subject) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        proxy.operation();

    }

    public void client2() {
        Subject target  = new RealSubject("amdin");
        Subject proxy = (Subject) new ProxySubject2(target ).getProxyInstance();
        proxy.operation();

    }
}
