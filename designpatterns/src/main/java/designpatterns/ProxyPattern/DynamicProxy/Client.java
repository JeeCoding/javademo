package designpatterns.ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.client1();
        client.client2();
        client.client3();
    }


    /**
     * 调用第一种动态代理
     */
    public void client1() {
        Subject subject = new RealSubject("admin");
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler invocationHandler = new ProxySubject(subject);
        Subject proxy = (Subject) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        proxy.operation();

    }

    /**
     * 调用第二种动态代理
     */
    public void client2() {
        Subject target = new RealSubject("amdin");
        Subject proxy = (Subject) new ProxySubject2(target).getProxyInstance();
        proxy.operation();

    }

    /**
     * 调用第三种动态代理
     */
    public void client3() {
        ProxySubject3 proxySubject3 = new ProxySubject3();
        Subject subject = (Subject) proxySubject3.bind(new RealSubject("admin"));
        subject.operation();

    }
}
