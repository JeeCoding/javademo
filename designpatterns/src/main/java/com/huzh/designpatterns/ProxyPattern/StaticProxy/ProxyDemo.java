package com.huzh.designpatterns.ProxyPattern.StaticProxy;

public class ProxyDemo {
    public static void main(String args[]) {
        RealSubject1 subject = new RealSubject1();
        Proxy p = new Proxy(subject);
        p.request();
    }
}

interface Subject1 {
    void request();
}

class RealSubject1 implements Subject1 {
    public void request() {
        System.out.println("request");
    }
}

class Proxy implements Subject1 {
    private Subject1 subject;

    public Proxy(Subject1 subject) {
        this.subject = subject;
    }

    public void request() {
        System.out.println("PreProcess");
        subject.request();
        System.out.println("PostProcess");
    }
}
