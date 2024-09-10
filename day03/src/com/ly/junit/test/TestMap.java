package com.ly.junit.test;

import com.ly.Dao.Employee;

import java.util.HashMap;

/**
 * Created by ly on 2024/9/4
 */
public class TestMap {
    public static void main(String[] args) {

        //1.key不能重复  无序
        HashMap<String, String> map = new HashMap<>();
        map.put("001","叽叽1");
        map.put("001","叽叽1");
        map.put("002","哈哈");

        // System.out.println(map);
        //map集合的key为自定义对象
        HashMap<Employee, String> map2 = new HashMap<>();

        Employee employee1 = new Employee();
        employee1.setName("班长");
        employee1.setIsCard("x001");

        Employee employee2 = new Employee();
        employee2.setName("班长");
        employee2.setIsCard("x001");

        map2.put(employee1,"班长");
        map2.put(employee2,"班长");
        System.out.println(map2);
    }
}
