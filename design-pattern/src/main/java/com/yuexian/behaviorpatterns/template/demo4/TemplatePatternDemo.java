package com.yuexian.behaviorpatterns.template.demo4;

/**
 * @author yuexian
 * @Description TODO
 * @Date 2021.4.14 10:25
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
