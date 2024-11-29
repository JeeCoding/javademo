package com.yuexian.create.builder;

/**
 * @author: YueXian
 * @date: 2024/6/28 15:01
 */
public class ComputerDirector {
    ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void constructComputer(String cpu,String memory,String hardDisk) {
        // 这里可以定义构建的顺序和逻辑
        builder.setCpu(cpu);
        builder.setMemory(memory);
        builder.setHardDisk(hardDisk);
    }

    public Computer getComputer() {
        return builder.build();
    }
}
