package com.yuexian.behaviorpatterns.command.demo1;

/**
 * @author yuexian
 * @Description
 * @Date 2021.4.14 11:00
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    ConcreteCommand() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
