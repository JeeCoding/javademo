package designpatterns.ProxyPattern.StaticProxy;

/**
 * 创建代理对象类
 */
public class ProxySubject implements Subject {
    Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void operation() {
        //在调用目标对象之前，完成一些操作
        System.out.println("Before Do Something");
        subject.operation();
        //在调用目标对象之后，完成一些操作
        System.out.println("After Do Something");
    }
}
