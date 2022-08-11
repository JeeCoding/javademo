package example_3.c_025;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Queue在高并发的情况下可以使用两种队列：
 * ConcurrentLinkedQueue：内部加锁的
 * BlockingQueue：阻塞式队列，如LinkedBlockingQueue，ArrayBlockingQueue。阻塞式的意思是，
 * 生产者消费者模式中生产者已经生产满了直接等待wait，消费如果空了消费者就会直接等待。
 * <p>
 * LinkedBockingQueue是链表实现的阻塞式容器，是无界队列（往里扔多少个元素都可以，内存满足的情况下）
 */
public class T05_LinkedBlockingQueue {

    static BlockingQueue<String> strs = new LinkedBlockingQueue<>();

    static Random r = new Random();

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    strs.put("a" + i); //如果满了，就会等待
                    TimeUnit.MILLISECONDS.sleep(r.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "p1").start();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                for (; ; ) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " take -" + strs.take()); //如果空了，就会等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "c" + i).start();

        }
    }
}
