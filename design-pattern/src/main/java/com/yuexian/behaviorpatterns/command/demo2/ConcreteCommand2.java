package com.yuexian.behaviorpatterns.command.demo2;

/**
 * @author yuexian
 * @description 树叶构件: 具体命令2
 * @date 2021.4.14 11:51
 */
public class ConcreteCommand2 implements AbstractCommand {

    private CompositeReceiver receiver;

    ConcreteCommand2() {
        receiver = new CompositeReceiver();
    }

    @Override
    public void execute() {
        receiver.action2();
    }
}
