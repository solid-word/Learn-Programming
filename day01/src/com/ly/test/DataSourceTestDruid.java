package com.ly.test;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by ly on 2024/9/3
 */
public class DataSourceTestDruid {
    public static void main(String[] args) throws Exception {

        //1. 创建数据库连接池
        DruidDataSource dataSource = new DruidDataSource();

        //2.通过set方法进行赋值
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/imss?characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setInitialSize(5);
        dataSource.setMaxActive(30);
        dataSource.setMaxWait(3000);

        Connection connection = dataSource.getConnection();

        System.out.println(connection);

    }
}
