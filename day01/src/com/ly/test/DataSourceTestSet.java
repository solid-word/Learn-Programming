package com.ly.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by ly on 2024/9/3
 */
public class DataSourceTestSet {


        public static void main(String[] args) throws Exception, PropertyVetoException {

            /**
             * 数据库连接池c3p0
             */
            //1.创建数据库连接池
            ComboPooledDataSource dataSource = new ComboPooledDataSource();

            //2.通过set方法进行赋值
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/imss?characterEncoding=UTF-8");
            dataSource.setUser("root");
            dataSource.setPassword("root");
            dataSource.setInitialPoolSize(5);
            dataSource.setMaxPoolSize(30);
            dataSource.setCheckoutTimeout(3000);

            Connection connection = dataSource.getConnection();

            System.out.println(connection);
        }


}
