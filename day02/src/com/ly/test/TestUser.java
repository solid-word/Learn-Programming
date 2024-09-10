package com.ly.test;

import com.ly.bean.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by ly on 2024/9/3
 */
public class TestUser {
//    public static void main(String[] args) throws Exception {
//
//        //1.加载类 方式1
//        Class<User> clazz = User.class;
//        System.out.println(clazz);
//
//        //2.加载类 方式2
//        Class clazz2 = Class.forName("com.ly.bean.User");
//        System.out.println(clazz2);
//
//        //3.方式三  自动加载
//        User user = new User();
//        Class clazz3 = user.getClass();
//        System.out.println(clazz3);
//    }

    @Before
    public void aa(){
        System.out.println("您好！");
    }
    //修饰符必须为public  返回值类型必须为void  方法名任意 不能有任何参数
    @Test
    public void getClazz(){
        //1.加载类 方式1
        Class<User> clazz = User.class;
        System.out.println(clazz);
    }

    @Test
    public void getClazz2() throws ClassNotFoundException {
        Class clazz2 = Class.forName("com.ly.bean.User");
        System.out.println(clazz2);
    }

    @After
    public void bb(){
        System.out.println("再见！");
    }

    /**
     * 获取变量
     * @throws Exception
     */
    @Test
    public void testFiled1() throws Exception {

        //1.加载类
        Class clazz = Class.forName("com.ly.bean.User");

        Field[] fields = clazz.getFields();

        System.out.println(Arrays.toString(fields));


        Field field = clazz.getDeclaredField("age");
        System.out.println(field);
    }

    /**
     * 操作变量
     * @throws Exception
     */
    @Test
    public  void testFiled2() throws Exception {

        //1.加载类
        Class clazz = Class.forName("com.ly.bean.User");

        User user = (User) clazz.newInstance();

        //获取变量
        Field field = clazz.getDeclaredField("age");

        //开启访问权限
        field.setAccessible(true);

        //针对变量进行赋值
        field.set(user,3);

        //获取属性的值
        Object value = field.get(user);
        System.out.println(value);

        //操作静态属性 无需传递对象，属于类的
        Field field1 = clazz.getField("address");
        field1.set(null,"成都");

        System.out.println(field1.get(null));
    }

    /**
     * 反射获取成员方法
     */
    @Test
    public void testMethod() throws Exception{

        //1.加载类
        Class clazz = Class.forName("com.ly.bean.User");

        User user = (User) clazz.newInstance();

        Method method = clazz.getMethod("aa",String.class);

        Object result = method.invoke(user, "hhhhhh");

        System.out.println(result);

        //反射私有的方法
        Method method2 = clazz.getDeclaredMethod("bb", String.class, String.class);

        method2.setAccessible(true);

        method2.invoke(user,"aa","bb");

        //反射静态的方法
        Method method3 = clazz.getMethod("cc");
        method3.invoke(null);
    }
}
