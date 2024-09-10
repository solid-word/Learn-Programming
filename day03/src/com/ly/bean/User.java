package com.ly.bean;

/**
 * Created by ly on 2024/9/3
 */
public class User {

    private Integer age;

    public String name;

    public static String address;

    public User(){

    }

    private User(Integer age){
        this.age = age;
    }

    public String aa(String aa){
        System.out.println("aa被调用了："+aa);
        return "您好";
    }

    private void bb(String aa,String bb){
        System.out.println("bb被调用了："+aa+","+bb);
    }

    public static void cc(){
        System.out.println("cc被调用了。。。");
    }

}
