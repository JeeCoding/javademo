package com.yuexian.behaviorpatterns.state.demo4;

import java.util.HashMap;

/**
 * @author yuexian
 * @description 环境类
 * @date 2021.4.14 16:41
 */
public class ShareContext {

    private ShareState state;
    private HashMap<String, ShareState> stateSet = new HashMap<>();

    public ShareContext() {
        state = new ConcreteState1();
        stateSet.put("1", state);

        state = new ConcreteState2();
        stateSet.put("2", state);

        state = getState("1");
    }

    //设置新状态
    public void setState(ShareState state) {
        this.state = state;
    }

    //读取状态
    public ShareState getState(String key) {
        return stateSet.get(key);
    }

    //对请求做处理
    public void Handle() {
        state.Handle(this);
    }
}
