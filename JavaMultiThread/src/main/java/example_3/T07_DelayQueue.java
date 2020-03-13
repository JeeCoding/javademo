package example_3;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * DelayQueue：无界队列，加进去的每一个元素，如果理解为一个任务的话，这个元素什么时候可以让消费者往外拿呢？
 * 每一个元素记载着我还有多长时间可以从队列中被消费者拿走；这个队列默认是排好顺序的，等待的时间最长的排在最前面，先往外拿；
 * <p>
 * DelayQueue往里添加的元素是要实现Delayed接口;
 * 可以用来执行定时任务；
 */
public class T07_DelayQueue {
    static BlockingQueue<MyTask> tasks = new DelayQueue<>();

    static Random r = new Random();

    static class MyTask implements Delayed {
        long runningTime;

        MyTask(long rt) {
            this.runningTime = rt;
        }

        @Override
        public int compareTo(Delayed o) {
            if (this.getDelay(TimeUnit.MILLISECONDS) < o.getDelay(TimeUnit.MILLISECONDS))
                return -1;
            else if (this.getDelay(TimeUnit.MILLISECONDS) > o.getDelay(TimeUnit.MILLISECONDS))
                return 1;
            else
                return 0;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(runningTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override
        public String toString() {
            return "" + runningTime;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        long now = System.currentTimeMillis();
        MyTask t1 = new MyTask(now + 1000);
        MyTask t2 = new MyTask(now + 2000);
        MyTask t3 = new MyTask(now + 1500);
        MyTask t4 = new MyTask(now + 2500);
        MyTask t5 = new MyTask(now + 500);

        tasks.put(t1);
        tasks.put(t2);
        tasks.put(t3);
        tasks.put(t4);
        tasks.put(t5);

        System.out.println(tasks);

        for (int i = 0; i < 5; i++) {
            System.out.println(tasks.take());
        }
    }
}
