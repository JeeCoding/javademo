package example_3.c_025;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * SynchronousQueue：同步队列，一种特殊的transferQueue，前面说的TransferQueue如果生产者生产了东西，
 * 这时候没有消费者，如果使用put/add，还可以扔到队列里，这个队列还是有一定的容量的；
 * 而SynchronousQueue叫做没有容量的队列，容量为0，生产者生产的东西必须马上消费掉，
 * 如果不消费掉就会出问题；调add抛异常（Queue full），调put程序阻塞；
 */
public class T09_SynchronusQueue {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> strs = new SynchronousQueue<>();

        new Thread(() -> {
            try {
                System.out.println(strs.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

//        TimeUnit.MILLISECONDS.sleep(10000);
        strs.put("aaa"); //阻塞等待消费者消费
//        strs.add("aaa");
        System.out.println(strs.size());
    }
}
