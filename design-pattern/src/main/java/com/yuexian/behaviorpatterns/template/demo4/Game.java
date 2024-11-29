package com.yuexian.behaviorpatterns.template.demo4;

/**
 * @author yuexian
 * @Description TODO
 * @Date 2021.4.14 10:21
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //模板
    public final void play() {

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
