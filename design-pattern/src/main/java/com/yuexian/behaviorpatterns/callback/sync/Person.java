package com.yuexian.behaviorpatterns.callback.sync;

/**
 * @author: YueXian
 * @date: 2024/6/24 14:43
 */
public class Person implements CallBack {

    private Genius genius;

    public Person(Genius genius) {
        this.genius = genius;
    }

    public void ask() {
        genius.answer(this);
    }


    public void askASyn() {
        System.out.println("创建线程请教问题");
        new Thread(() -> genius.answer(this)).start();
        System.out.println("新线程已启动。。。");
    }

    @Override
    public void callback(String string) {
        System.out.println("收到答案：" + string);
    }

    public static void main(String[] args) {
        Genius genius1 = new Genius();
        Person you = new Person(genius1);
        you.askASyn();
    }
}
