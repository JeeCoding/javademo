package com.yuexian.behaviorpatterns.command.demo2;

import java.util.ArrayList;

/**
 * @author yuexian
 * @description 树枝构件: 调用者
 * @date 2021.4.14 11:52
 */
public class CompositeInvoker implements AbstractCommand {
    private ArrayList<AbstractCommand> children = new ArrayList<AbstractCommand>();

    public void add(AbstractCommand c) {
        children.add(c);
    }

    public void remove(AbstractCommand c) {
        children.remove(c);
    }

    public AbstractCommand getChild(int i) {
        return children.get(i);
    }

    @Override
    public void execute() {
        children.forEach(AbstractCommand::execute);
    }
}
