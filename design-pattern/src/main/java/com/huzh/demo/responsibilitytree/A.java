package com.huzh.demo.responsibilitytree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huzh
 * @date 2021.3.30 19:28
 */
public class A extends AbstractStrategyRouter<String, Boolean>
        implements StrategyHandler<String, Boolean> {

    /**
     * 定义用来存储执行策略的map集合
     */
    private Map<String, StrategyHandler> strategyMap = new HashMap();

    @Override
    protected StrategyMapper<String, Boolean> registerStrategyMapper() {
        strategyMap.put(StrategyEnum.A1.name(),new A1());
        strategyMap.put(StrategyEnum.A2.name(),new A2());
        return null;
    }

    @Override
    public Boolean apply(String param) {
        return null;
    }
}
