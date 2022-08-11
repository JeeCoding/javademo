package example_3.c_025;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CountDownLatch;

/**
 *多线程的环境下ConcurrentHashMap的效率要比hashTable高一些，高在哪？
 * hashTable往里加任何一个数据的时候，都是要锁定整个hashTable对象，
 * 而concurrentHashMap默认的是把容器分成16段，每次往里插数据的时候只锁定16段其中的一个部分；把锁细化了；
 * 当很多线程共同往里插数据的时候，线程A插的是其中一段，线程B是往另一段里插，那么这两个线程就可以同时并发的往里插；
 * 因此多线程环境下要比hashTable高；
 */
public class T01_ConcurrentMap {
    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>();
//        Map<String, String> map = new ConcurrentSkipListMap<>(); //高并发并且排序

//        Map<String, String> map = new Hashtable<>();
        //Map<String, String> map = new HashMap<>(); //Collections.synchronizedXXX
        //TreeMap
        Random r = new Random();
        Thread[] ths = new Thread[100];
        CountDownLatch latch = new CountDownLatch(ths.length);
        long start = System.currentTimeMillis();
        for (int i = 0; i < ths.length; i++) {
            ths[i] = new Thread(() -> {
                for (int j = 0; j < 10000; j++)
                    map.put("a" + r.nextInt(100000), "a" + r.nextInt(100000));
                latch.countDown();
            });
        }

        Arrays.asList(ths).forEach(t -> t.start());
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
