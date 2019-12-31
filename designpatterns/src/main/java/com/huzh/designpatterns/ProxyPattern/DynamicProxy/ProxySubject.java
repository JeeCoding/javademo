package com.huzh.designpatterns.ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * 创建第一种动态代理对象类
 */
public class ProxySubject implements InvocationHandler {

    private Object target;

    public ProxySubject(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        //在调用目标对象之前，完成一些操作
        before();
        Object result = method.invoke(target, args);
        //在调用目标对象之后，完成一些操作
        after();
        return result;
    }

    // 调用invoke方法之前执行
    private void before() {
        System.out.println(String.format("log start time [%s] ", new Date()));
    }

    // 调用invoke方法之后执行
    private void after() {
        System.out.println(String.format("log end time [%s] ", new Date()));
    }
}
