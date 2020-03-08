package designpatterns.ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyDemo01 {
    public static void main(String[] args) {
        RealSubject1 realSubject = new RealSubject1();    //1.创建委托对象
        ProxyHandler1 handler = new ProxyHandler1(realSubject);   //2.创建调用处理器对象
        Subject1 proxySubject = (Subject1) Proxy.newProxyInstance(RealSubject1.class.getClassLoader(),
                RealSubject1.class.getInterfaces(), handler);    //3.动态生成代理对象
        proxySubject.request(); //4.通过代理对象调用方法
    }
}

/**
 * 接口
 */
interface Subject1 {
    void request();
}

/**
 * 委托类
 */
class RealSubject1 implements Subject1 {
    public void request() {
        System.out.println("====RealSubject Request====");
    }
}

/**
 * 代理类的调用处理器
 */
class ProxyHandler1 implements InvocationHandler {
    private Subject1 subject;

    public ProxyHandler1(Subject1 subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("====before====");//定义预处理的工作，当然你也可以根据 method 的不同进行不同的预处理工作
        Object result = method.invoke(subject, args);
        System.out.println("====after====");
        return result;
    }
}