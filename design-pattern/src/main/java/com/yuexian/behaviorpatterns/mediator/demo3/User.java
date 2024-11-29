package com.yuexian.behaviorpatterns.mediator.demo3;

/**
 * @author yuexian
 * @description
 * @date 2021.4.20 14:11
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
