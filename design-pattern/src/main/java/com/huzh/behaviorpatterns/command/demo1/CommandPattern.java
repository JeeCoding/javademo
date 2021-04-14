package com.huzh.behaviorpatterns.command.demo1;

/**
 * @author huzh
 * @Description
 * @Date 2021.4.14 11:02
 */
public class CommandPattern {
    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }
}
