package com.yuexian.behaviorpatterns.template.demo4;

/**
 * @author yuexian
 * @Description TODO
 * @Date 2021.4.14 10:22
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
