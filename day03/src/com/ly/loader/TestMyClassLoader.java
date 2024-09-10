package com.ly.loader;

import java.lang.reflect.Method;

/**
 * Created by ly on 2024/9/4
 */
public class TestMyClassLoader {

    public static void main(String[] args) throws Exception {

        MyClassLoader myClassLoader = new MyClassLoader("E:\\K\\aa");

        //2.加载类
        Class clazz = myClassLoader.loadClass("com.ly.bean.User");

        Object obj = clazz.newInstance();

        System.out.println(obj);

        System.out.println(clazz);

        Method method = clazz.getMethod("cc");

        method.invoke(null);
    }
}
