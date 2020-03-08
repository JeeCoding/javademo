package example_4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * ForkJoinPool： forkjoin的意思就是如果有一个难以完成的大任务，需要计算量特别大，时间特别长，
 * 可以把大任务切分成一个个小任务，如果小任务还是太大，它还可以继续分，至于分成多少你可以自己指定，... 分完之后，
 * 把结果进行合并，最后合并到一起join一起，产生一个总的结果。而里面任务的切分你可以自己指定，线程的启动根据你任务切分的规则，
 * 由ForkJoinPool这个线程池自己来维护。
 */
public class MyForkJoinPool {
    static int[] nums = new int[1000000];
    static final int MAX_NUM = 50000;
    static Random r = new Random();

    static {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(100);
        }

        System.out.println(Arrays.stream(nums).sum()); //stream api
    }


    static class AddTask extends RecursiveAction {

        int start, end;

        AddTask(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        protected void compute() {

            if (end - start <= MAX_NUM) {
                long sum = 0L;
                for (int i = start; i < end; i++) sum += nums[i];
                System.out.println("from:" + start + " to:" + end + " = " + sum);
            } else {
                int middle = start + (end - start) / 2;
                AddTask subTask1 = new AddTask(start, middle);
                AddTask subTask2 = new AddTask(middle, end);
                subTask1.fork();
                subTask2.fork();
            }
        }
    }

    /**
     * 例子解释：
     * 对数组中100万个数求和计算，第一种方式是普通的将所有数加在一起（for循环）；
     * <p>
     * 第二种方式使用ForkJoinPool计算，分而治之，它里面执行的任务必须是ForkJoinTask，这个任务可以自动进行切分，
     * 一般用的时候从RecursiveAction或RecursiveTask继承，RecursiveTask递归任务，因为它切分任务还可以在切分。
     * RecursiveAction没有返回值，RecursiveTask有返回值。
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        ForkJoinPool fjp = new ForkJoinPool();
        AddTask task = new AddTask(0, nums.length);
        fjp.execute(task);

        System.in.read();

    }
}
