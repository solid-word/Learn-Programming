package com.ly.map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {


        HashMap map = new HashMap();
        map.put("001","小狗");
        map.put("001","小狗");
        map.put("002","小猴子");
        map.put(null,"xxx01");
        System.out.println(map);

        Hashtable table = new Hashtable();
        table.put("001","小狗");
        table.put("001","小狗");
        table.put("002","小猴子");
        table.put(null,"xxx01");
        System.out.println(table);
    }
}
