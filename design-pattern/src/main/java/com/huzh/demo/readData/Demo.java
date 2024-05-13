package com.huzh.demo.readData;

/**
 * @author: YueXian
 * @date: 2024/5/13 23:04
 */
public class Demo {
    public static void main(String[] args) {
        // 创建实时数据生产者
        RealTimeDataProducer producer = new RealTimeDataProducer();

        // 创建数据存储观察者
        DataObserver storage = new DataStorage();

        // 数据存储观察者订阅实时数据生产者
        producer.addObserver(storage);

        // 启动数据生产者
        producer.startProducing();
    }
}

