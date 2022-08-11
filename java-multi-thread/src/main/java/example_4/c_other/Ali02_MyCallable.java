package example_4.c_other;

import java.util.concurrent.Callable;

/**
 * @ClassName Ali02_MyCallable
 * @Description TODO
 * @Date 2020/3/10 17:14
 * @Author huzh
 * @Version 1.0
 */
public class Ali02_MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        //返回执行当前 Callable 的线程名字
        return Thread.currentThread().getName();
    }
}
