package com.ly.Dao;

/**
 * Created by ly on 2024/9/4
 */
public class Employee {

    private String name;


    private String isCard;

    //如果两个对象所有成员变量的值都是一致的时候，我们认为他们就是同一个对象

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsCard() {
        return isCard;
    }

    public void setIsCard(String isCard) {
        this.isCard = isCard;
    }

}
