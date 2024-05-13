package com.huzh.demo.db;

// 数据库工厂类
public class DatabaseFactory {
    public static DatabaseDriver createDatabaseDriver(String type) {
        if (type.equalsIgnoreCase("MySQL")) {
            return new MySQLDriver();
        } else if (type.equalsIgnoreCase("PostgreSQL")) {
            return new PostgreSQLDriver();
        }
        // 可以添加其他数据库类型的实现类
        return null;
    }
}