package com.yuexian.behaviorpatterns.state.demo2;

/**
 * @author yuexian
 * @description 具体状态类：中等
 * @date 2021.4.14 16:08
 */
public class MiddleState extends AbstractState {
    public MiddleState(AbstractState state) {
        hj = state.hj;
        stateName = "中等";
        score = state.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score >= 90) {
            hj.setState(new HighState(this));
        }
    }
}