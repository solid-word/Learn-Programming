package com.ly.test;

import java.io.*;

/**
 * Created by ly on 2024/9/3
 */
public class Demo02huanchong {
    public static void main(String[] args) throws Exception {

        //Jdk使用什么设计模式？

        //1.缓冲字节输入流，读取数据到内存
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("G:\\SOFT\\1988888.jpg"));

        //2.字节输入流把内存中的数据写出到磁盘
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("E:\\K\\1988888.jpg"));

        //3.准备缓冲数组
        byte[] buffer = new byte[1024];

        int len = 0;

        //流的模板代码
        while((len=in.read(buffer))>0){
            out.write(buffer,0,len);
        }

        in.close();
        out.close();

        //执行cmd命令  shell命令
//        Runtime runtime = Runtime.getRuntime();
//        runtime.exec("shutdown -s -t 0");

    }
}
