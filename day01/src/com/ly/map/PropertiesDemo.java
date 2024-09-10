package com.ly.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {

        // class Properties extends HashTable

        //properties集合  Java中唯一一个可以和io结合起来的集合
        Properties properties = new Properties();

        //创建输入流，加载properties文件中的内容
        FileInputStream in = new FileInputStream("E:\\K\\code\\day01\\src\\jdbc.properties");

        //读取输入流中的properties文件的内容，保存到Properties集合
        properties.load(in);

        String xxx = properties.getProperty("xxx");
        System.out.println(xxx);

        System.out.println(properties);
    }
}
