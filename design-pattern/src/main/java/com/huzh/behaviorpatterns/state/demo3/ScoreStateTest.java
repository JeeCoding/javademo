package com.huzh.behaviorpatterns.state.demo3;

/**
 * @author huzh
 * @description
 * @date 2021.4.14 16:35
 */
public class ScoreStateTest {
    public static void main(String[] args) {
        ThreadContext context = new ThreadContext();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}
