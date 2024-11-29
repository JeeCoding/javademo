package com.yuexian.create.builder;

/**
 * @author: YueXian
 * @date: 2024/6/28 14:58
 */
public class GamingComputerBuilder implements ComputerBuilder {
    private final Computer computer = new Computer();

    @Override
    public void setCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void setMemory(String memory) {
        computer.setMemory(memory);
    }

    @Override
    public void setHardDisk(String hardDisk) {
        computer.setHardDisk(hardDisk);
    }

    @Override
    public Computer build() {
        return computer;
    }
}
