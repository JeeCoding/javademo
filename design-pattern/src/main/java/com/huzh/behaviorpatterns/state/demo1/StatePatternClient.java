package com.huzh.behaviorpatterns.state.demo1;

/**
 * @author huzh
 * @description
 * @date 2021.4.14 15:56
 */
public class StatePatternClient {
    public static void main(String[] args) {
        Context context = new Context();    //创建环境
        context.Handle();    //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
