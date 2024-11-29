package com.yuexian.behaviorpatterns.state.demo4;

/**
 * @author yuexian
 * @description 抽象状态类
 * @date 2021.4.14 16:41
 */
public abstract class ShareState {
    public abstract void Handle(ShareContext context);
}
