package com.huzh.behaviorpatterns.iterator.demo2;

/**
 * @author huzh
 * @description
 * @date 2021.4.20 16:45
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
