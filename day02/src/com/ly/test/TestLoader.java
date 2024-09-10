package com.ly.test;

import com.ly.bean.User;

import java.io.InputStream;

/**
 * Created by ly on 2024/9/3
 */
public class TestLoader {
    public static void main(String[] args) {

        //1.加载额外的资源

        //只要是我们自己写的类，都是被同一个类加载器加载，应用类加载器
        //加载的  位置就是项目编译后的根目录

        //获取类加载器
        Class<User> clazz1 = User.class;
        ClassLoader classLoader = clazz1.getClassLoader();
        //sun.misc.Launcher$AppClassLoader
        System.out.println(classLoader);

//        Class<TestLoader> clazz2 = TestLoader.class;
//        ClassLoader classLoader2 = clazz2.getClassLoader();
//        System.out.println(classLoader2);

        //绝对路径  完整路径
        //相对路径  相对于的项目路径

        InputStream in = classLoader.getResourceAsStream("jdbc.properties");
        System.out.println(in);

    }
}
