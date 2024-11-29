package com.yuexian.behaviorpatterns.chainofresponsibility.demo3;

/**
 * @author yuexian
 * @date 2021.3.26 13:32
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
