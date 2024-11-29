package com.yuexian.create.builder;

/**
 * @author: YueXian
 * @date: 2024/6/28 14:56
 */
public interface ComputerBuilder {
    void setCpu(String cpu);

    void setMemory(String memory);

    void setHardDisk(String hardDisk);

    Computer build();
}
