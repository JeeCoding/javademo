package com.yuexian.behaviorpatterns.mediator.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuexian
 * @description 简单单例中介者
 * @date 2021.4.20 12:15
 */
public class SimpleMediator {
    private static final SimpleMediator SMD = new SimpleMediator();
    private final List<SimpleColleague> colleagues = new ArrayList<>();

    private SimpleMediator() {
    }

    public static SimpleMediator getMedium() {
        return (SMD);
    }

    public void register(SimpleColleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
        }
    }

    public void relay(SimpleColleague scl) {
        colleagues.stream().filter(item -> !item.equals(scl)).forEach(SimpleColleague::receive);
    }
}
