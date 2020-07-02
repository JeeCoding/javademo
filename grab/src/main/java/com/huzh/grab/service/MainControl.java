package com.huzh.grab.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huzh
 * @date 2020/7/2 9:46
 */
public class MainControl {

    private static final int CORE_POOL_SIZE = 4;
    private static final int MAX_POOL_SIZE = 4;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;


    public static void main(String[] args) {

        Map<String, String> bookUrlMap = new HashMap<>();
        bookUrlMap.put("水浒传", "https://www.mingqingxiaoshuo.com/yingxiongchuanqi/shuihuchuan/");
        bookUrlMap.put("西游记", "https://www.mingqingxiaoshuo.com/guiguaishenmo/xiyouji/");
        bookUrlMap.put("三国演义", "https://www.mingqingxiaoshuo.com/lishiyanyi/sanguoyanyi/");
        bookUrlMap.put("红楼梦", "https://www.mingqingxiaoshuo.com/shitairenqing/hongloumeng/");
        bookUrlMap.put("金瓶梅", "https://www.mingqingxiaoshuo.com/shitairenqing/jinpingmei/");

        GetHTML.urlControl(bookUrlMap);

//        String s  = HttpUtil.get("https://www.mingqingxiaoshuo.com/lishiyanyi/sanguoyanyi/");
//        System.out.println(s);


        //使用阿里巴巴推荐的创建线程池的方式
        //通过ThreadPoolExecutor构造函数自定义参数创建
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(
//                CORE_POOL_SIZE,
//                MAX_POOL_SIZE,
//                KEEP_ALIVE_TIME,
//                TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
//                new ThreadPoolExecutor.CallerRunsPolicy());
//
//        for (Map.Entry<String, String> entry : bookUrlMap.entrySet()) {
//            executor.execute(() -> {
//                try {
//                    String content = ParseHTML.parseBook(HttpUtil.get(entry.getValue())).toString();
//                    WriteTo.writeto(content, entry.getKey());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
//        }
//
//        //终止线程池
//        executor.shutdown();
//        while (!executor.isTerminated()) {
//        }
    }
}
