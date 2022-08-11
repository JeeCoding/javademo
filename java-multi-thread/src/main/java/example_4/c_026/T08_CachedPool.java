package example_4.c_026;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * FixedThreadPool为固定个数的线程池；
 * CachedThreadPool：刚开始一个线程都没有，来一个任务就起一个线程，假设起了两个线程A，B，如果来了第三个任务，
 * 这时候恰好线程B任务执行完了，线程池里面有空闲的，这时候直接让线程池里空闲的线程B来执行；
 * 最多起多少个线程？你的系统能支撑多少个为止；
 * 默认的情况下，只要一个线程空闲的状态超过60s，这个线程就自动的销毁了，alivetime=60s；这个值也可以自己指定。
 */
public class T08_CachedPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        System.out.println(service);

        for (int i = 0; i < 2; i++) {
            service.execute(() -> {
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            });
        }

        System.out.println(service);

        TimeUnit.SECONDS.sleep(80); //cachedthreadPool里面的线程空闲状态默认60s后销毁，这里保险起见

        System.out.println(service);


    }
}
