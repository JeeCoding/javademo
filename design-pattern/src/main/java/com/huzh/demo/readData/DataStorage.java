package com.huzh.demo.readData;

/**
 * @author: YueXian
 * @date: 2024/5/13 22:55
 */
public class DataStorage implements DataObserver {
    @Override
    public void update(String data) {
        // 模拟将数据存储到数据库或者文件中
        System.out.println("Storing data: " + data);
    }
}
