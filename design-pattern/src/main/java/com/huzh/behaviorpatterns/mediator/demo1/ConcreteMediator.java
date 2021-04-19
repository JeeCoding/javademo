package com.huzh.behaviorpatterns.mediator.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huzh
 * @description 具体中介者
 * @date 2021.4.16 18:29
 */
public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague cl) {
        colleagues.forEach(item -> {
            if (item.equals(cl)) {
                item.receive();
            }
        });
    }
}
