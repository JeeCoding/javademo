package com.yuexian.behaviorpatterns.callback;

/**
 * @author: YueXian
 * @date: 2024/6/24 14:26
 */
public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        System.out.println("开始读取文件...");

        fileReader.readFile("example.txt", new FileReadCallback() {
            @Override
            public void onSuccess(String content) {
                System.out.println("文件读取成功:");
                System.out.println(content);
            }

            @Override
            public void onError(Exception e) {
                System.out.println("文件读取失败:");
                System.out.println(e.getMessage());
            }
        });

        System.out.println("文件读取请求已发送,继续执行其他操作...");

        // 为了让主线程不立即结束,我们可以添加一个简单的循环
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("主线程正在执行其他操作...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
