package com.yuexian.behaviorpatterns.command.demo2;

/**
 * @author yuexian
 * @description 树叶构件: 具体命令1
 * @date 2021.4.14 11:48
 */
public class ConcreteCommand1 implements AbstractCommand {

    private CompositeReceiver receiver;

    ConcreteCommand1() {
        receiver = new CompositeReceiver();
    }

    @Override
    public void execute() {
        receiver.action1();
    }
}
