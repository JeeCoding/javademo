package designpatterns.behaviorpatterns.strategy.demo2;

/**
 * @author huzh
 * @date 2021.3.29 12:58
 * 具体策略类B
 */
class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
