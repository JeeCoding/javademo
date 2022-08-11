package example_4.c_026;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * SingleThreadExecutor：线程池里就1个线程；扔5个任务，也永远只有1个线程执行；
 * 它能保证任务前后一定是顺序执行，先扔的任务一定先执行完；只有等第一个任务执行完才执行第二个任务
 * 用于顺序执行任务
 */
public class T09_SingleThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            final int j = i;
            service.execute(() -> {

                System.out.println(j + " " + Thread.currentThread().getName());
            });
        }
    }
}
