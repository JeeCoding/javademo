package com.yuexian.behaviorpatterns.callback;

import java.util.Random;

/**
 * @author: YueXian
 * @date: 2024/6/24 14:15
 */
public class FileReader {

    public void readFile(String fileName, FileReadCallback callback) {
        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            Random random = new Random();
            if (random.nextBoolean()) {
                String content = "这是来自 " + fileName + " 的内容";
                callback.onSuccess(content);
            } else {
                callback.onError(new Exception("无法读取文件: " + fileName));
            }
        }).start();
    }

}
