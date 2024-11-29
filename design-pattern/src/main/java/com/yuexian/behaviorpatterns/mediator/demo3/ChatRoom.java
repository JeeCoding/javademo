package com.yuexian.behaviorpatterns.mediator.demo3;

import java.util.Date;

/**
 * @author yuexian
 * @description
 * @date 2021.4.20 14:10
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
