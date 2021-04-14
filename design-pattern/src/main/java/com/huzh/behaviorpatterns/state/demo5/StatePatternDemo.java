package com.huzh.behaviorpatterns.state.demo5;

/**
 * @author huzh
 * @description
 * @date 2021.4.14 16:59
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
