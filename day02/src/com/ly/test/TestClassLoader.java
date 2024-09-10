package com.ly.test;

import com.ly.bean.User;
import org.junit.Test;
import sun.security.ec.ECDHKeyAgreement;

/**
 * Created by ly on 2024/9/3
 */
public class TestClassLoader {

    @Test
    public  void testClassLoader1() {

        //AppClassLoader
        ClassLoader classLoader1 = TestClassLoader.class.getClassLoader();
        System.out.println(classLoader1);

        //AppClassLoader
        ClassLoader classLoader2 = User.class.getClassLoader();
        System.out.println(classLoader2);

        //引导类加载器  C语言
        ClassLoader classLoader3 = String.class.getClassLoader();
        System.out.println(classLoader3);

        //扩展类加载器  ExtClassLoader
        ClassLoader classLoader = ECDHKeyAgreement.class.getClassLoader();
        System.out.println(classLoader);

    }

    @Test
    public void testClassLoader() throws ClassNotFoundException {

        //1.加载类
        Class clazz = Class.forName("com.ly.bean.User");

        //系统类加载器
        ClassLoader classLoader = clazz.getClassLoader();
        System.out.println(classLoader);

        //扩展类加载器
        ClassLoader loaderParent = classLoader.getParent();
        System.out.println(loaderParent);

        //引导类加载器
        ClassLoader parentParent = loaderParent.getParent();
        System.out.println(parentParent);


    }
}
