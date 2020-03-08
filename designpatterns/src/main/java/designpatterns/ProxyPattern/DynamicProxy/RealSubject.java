package designpatterns.ProxyPattern.DynamicProxy;

/**
 * 创建目标对象类
 */
public class RealSubject implements Subject {
    private String name;

    public RealSubject(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(name + ": Do Something!");
    }
}
