package com.huzh.behaviorpatterns.command.demo1;

/**
 * @author huzh
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
