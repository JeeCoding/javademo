package com.yuexian.demo.readData;

/**
 * @author: YueXian
 * @date: 2024/5/13 22:56
 */
public interface DataProducer {
    void addObserver(DataObserver observer);

    void removeObserver(DataObserver observer);

    void notifyObservers(String data);
}
