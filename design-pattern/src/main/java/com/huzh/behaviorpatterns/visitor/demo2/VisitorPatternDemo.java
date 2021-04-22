package com.huzh.behaviorpatterns.visitor.demo2;

/**
 * @author huzh
 * @description
 * @date 2021.4.22 17:05
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
