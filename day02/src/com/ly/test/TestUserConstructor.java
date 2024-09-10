package com.ly.test;

import com.ly.bean.User;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Created by ly on 2024/9/3
 */
public class TestUserConstructor {

    @Test
    public void testConstructor() throws Exception {

        //1.加载类
        Class clazz = Class.forName("com.ly.bean.User");


        //2.获取所有的构造器（public修饰）
        Constructor[] constructors = clazz.getConstructors();

        System.out.println(Arrays.toString(constructors));

        //获取所有的构造器，不管是私有的还是公有的
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println(Arrays.toString(declaredConstructors));

        //获取无参构造器
        Constructor constructor = clazz.getConstructor(null);
        System.out.println(constructor);

        //获取有参并且私有的构造器
        Constructor constructor2 = clazz.getDeclaredConstructor(Integer.class);
        System.out.println(constructor2);
    }

    @Test
    public void testConstructor2() throws Exception {
        //1.加载类
        Class clazz = Class.forName("com.ly.bean.User");

        //2.获取无参构造器
        Constructor constructor = clazz.getConstructor(null);


        //调用该构造方法创建对象
        User user = (User) constructor.newInstance(null);

        System.out.println(user);

        //获取私有构造器
        Constructor constructor2 = clazz.getDeclaredConstructor(Integer.class);

        //开启访问权限
        constructor2.setAccessible(true);

        User user2= (User) constructor2.newInstance(3);

        System.out.println(user2);
    }

    @Test
    public void testConstructor3() throws Exception{

        //1.加载类
        Class<?> clazz = Class.forName("com.ly.bean.User");

//        //2.获取无参构造器
//        Constructor constructor = clazz.getConstructor(null);
//
//        //调用该构造方法创建对象
//        User user = (User) constructor.newInstance(null);

        User user = (User) clazz.newInstance();
        System.out.println(user);
    }
}
