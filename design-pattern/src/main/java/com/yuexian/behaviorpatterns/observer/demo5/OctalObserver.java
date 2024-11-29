package com.yuexian.behaviorpatterns.observer.demo5;

/**
 * @author yuexian
 * @description
 * @date 2021.4.16 17:35
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
