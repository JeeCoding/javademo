package com.huzh.demo.db;

/**
 * @author: YueXian
 * @date: 2024/5/13 22:42
 */
public interface DatabaseDriver {
    void connect();

    void disconnect();

    void executeQuery(String query);
    // 其他数据库操作方法
}
