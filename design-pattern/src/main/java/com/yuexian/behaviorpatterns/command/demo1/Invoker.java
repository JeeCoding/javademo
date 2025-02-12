package com.yuexian.behaviorpatterns.command.demo1;

/**
 * @author yuexian
 * @Description
 * @Date 2021.4.14 11:02
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
