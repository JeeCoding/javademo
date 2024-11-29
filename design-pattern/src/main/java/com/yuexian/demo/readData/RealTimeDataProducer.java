package com.yuexian.demo.readData;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: YueXian
 * @date: 2024/5/13 23:00
 */
public class RealTimeDataProducer implements DataProducer {
    private List<DataObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(DataObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(DataObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String data) {
        for (DataObserver observer : observers) {
            observer.update(data);
        }
    }

    public void startProducing() {
        // 模拟生产实时数据
        for (int i = 0; i < 10; i++) {
            String data = "Data " + i;
            System.out.println("Producing data: " + data);
            notifyObservers(data);
            try {
                Thread.sleep(1000); // 模拟数据产生间隔
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
