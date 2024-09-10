package com.ly.junit.test;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * Created by ly on 2024/9/4
 */
public class JdbcUtils {

    //准备Properties集合
    private  static Properties config = new Properties();

    //连接池
    private static DataSource dataSource;

    static {
        try{

            //1.读取Properties文件的内容
            InputStream in = JdbcUtils.class.getClassLoader().
                    getResourceAsStream("dataSource.properties");
            config.load(in);

            //2.创建连接池
            DruidDataSource druidDataSource = new DruidDataSource();
            druidDataSource.setDriverClassName(config.getProperty("jdbc.DriverClassName"));
            druidDataSource.setUrl(config.getProperty("jdbc.url"));
            druidDataSource.setUsername(config.getProperty("jdbc.username"));
            druidDataSource.setPassword(config.getProperty("jdbc.password"));

            dataSource = druidDataSource;


        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("创建连接池失败");
        }
    }


    /**
     * 获取连接池
     * @return
     */
    public static Connection getConnection(){

        try{
            Connection connection = dataSource.getConnection();
            return connection;

        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("获取连接池失败！");
        }
    }

    /**
     * 关闭资源
     */
    public static void close(Connection conn, Statement st, ResultSet rs){

        if (rs!=null){
            try{

            }catch (Exception e){

            }
        }
    }
}
