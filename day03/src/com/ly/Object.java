package com.ly;

/**
 * Created by ly on 2024/9/5
 */
public class Object {

    //默认根据内存地址计算出来的值
    public native int hashCode();

    //默认比较内存地址
    public boolean equals(Object obj){
        return (this == obj);
    }
}
