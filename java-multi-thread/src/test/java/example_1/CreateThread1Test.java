package example_1;

/**
 * start()，创建启动新的线程，可以实现多线程工作。通过start()使得线程处于就绪状态，在获得CPU时间片后通过run()开始运
 */
public class CreateThread1Test {

    public static void main(String[] args) {
        CreateThreadExtend thread1 = new CreateThreadExtend();
        thread1.start();

        CreateThreadInterface thread2 = new CreateThreadInterface();
        Thread thread = new Thread(thread2);
        thread.start();
    }
}