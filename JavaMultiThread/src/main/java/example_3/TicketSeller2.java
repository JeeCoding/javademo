package example_3;

import java.util.Vector;
import java.util.concurrent.TimeUnit;

/**
 * 使用Vector或者Collections.synchronizedXXX
 * 分析一下，这样能解决问题吗？
 */
public class TicketSeller2 {
    static Vector<String> tickets = new Vector<>();

    static {
        for (int i = 0; i < 1000; i++) tickets.add("票 编号：" + i);
    }

    /**
     * Vector是一个同步容器，所有的方法都是加锁的；
     * <p>
     * 虽然说在Vector里面remove方法是原子的，但是while条件中判断和remove是分离的；如果在while条件和remove之间被打断的话，问题依旧；
     * （假设剩下最后一张票，多个线程争抢同一张票，每一个线程判断的size大于0，虽然size和remove都是原子性的，
     * 但是在判断和remove中间的这段过程中，还是可能被打断，A线程判断了size>0,还没有remove的时候被打断了，
     * B线程把票拿走了，A线程继续往下执行的时候再remove就出问题了。）
     * 所以只是把List换成同步容器Vector，问题依旧；
     **/
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                while (tickets.size() > 0) {

//                    try {
//                        TimeUnit.MILLISECONDS.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }

                    System.out.println("销售了--" + tickets.remove(0));
                }
            }).start();
        }
    }
}
