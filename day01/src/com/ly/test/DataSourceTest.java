package com.ly.test;

import com.ly.datasource.MyDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceTest {

    public static void main(String[] args) throws SQLException {

        /*
        DataSource dataSource = new MyDataSource();

        Connection connection = dataSource.getConnection();

        System.out.println(connection);

        //连接用完了怎么还回去？
        connection.close();

         */

        /**
         * 数据库连接池c3p0
         */
        DataSource dataSource = new ComboPooledDataSource();

        Connection connection = dataSource.getConnection();

        System.out.println(connection);

        connection.close();


    }
}
