package com.huzh.demo.db;

// 应用程序示例
public class Application {
    public static void main(String[] args) {
        // 创建数据库驱动
        DatabaseDriver driver = DatabaseFactory.createDatabaseDriver("MySQL");

        // 连接数据库
        driver.connect();

        // 执行查询
        driver.executeQuery("SELECT * FROM table");

        // 断开连接
        driver.disconnect();
    }
}
