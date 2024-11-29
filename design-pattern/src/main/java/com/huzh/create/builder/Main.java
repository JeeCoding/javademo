package com.huzh.create.builder;

/**
 * @author: YueXian
 * @date: 2024/6/28 15:02
 */
public class Main {
    public static void main(String[] args) {
        // 创建一个GamingComputerBuilder对象
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();

        // 创建一个ComputerDirector对象，并使用GamingComputerBuilder
        ComputerDirector gamingDirector = new ComputerDirector(gamingBuilder);

        // 指导者开始构建电脑
        gamingDirector.constructComputer("Intel i7", "16GB RAM", "1TB SSD");

        // 获取并打印构建好的电脑
        Computer gamingComputer = gamingDirector.getComputer();
        System.out.println(gamingComputer);

    }
}
