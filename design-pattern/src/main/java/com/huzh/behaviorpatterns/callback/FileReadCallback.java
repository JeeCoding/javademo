package com.huzh.behaviorpatterns.callback;

/**
 * @author: YueXian
 * @date: 2024/6/24 14:12
 */
public interface FileReadCallback {

    void onSuccess(String content);

    void onError(Exception e);
}
