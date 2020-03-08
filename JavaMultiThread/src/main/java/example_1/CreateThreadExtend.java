package example_1;

/**
 * run()，实质上是方法，作用是运行线程，无法开启新的线程
 */
public class CreateThreadExtend extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("继承创建方式");
    }
}
