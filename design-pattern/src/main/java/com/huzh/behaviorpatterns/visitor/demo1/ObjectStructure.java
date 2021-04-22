package com.huzh.behaviorpatterns.visitor.demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author huzh
 * @description
 * @date 2021.4.22 16:45
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<Element>();

    public void accept(Visitor visitor) {
        Iterator<Element> i = list.iterator();
        while (i.hasNext()) {
            ((Element) i.next()).accept(visitor);
        }
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }
}
