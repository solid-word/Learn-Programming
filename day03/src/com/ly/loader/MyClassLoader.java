package com.ly.loader;

import sun.misc.Launcher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by ly on 2024/9/4
 */
public class MyClassLoader extends ClassLoader{

    private String classpath;

    //定义有参构造器，传递加载代码的目根录
    public  MyClassLoader(String classpath){
        this.classpath = classpath;
    }

    //com.ly.bean.User
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        //1.读取磁盘上的class字节码文件，读取成byte类型的数组
        byte[] bytes = loadByte(name);

        //2.把我们的字节数组加载到方法区的内存中，返回class字节码对象
        return defineClass(name,bytes,0,bytes.length);
    }

    private byte[] loadByte(String className) throws ClassNotFoundException {

        try{
            //com.ly.bean.User-->E://K//aa//com//ly//bean//User
            FileInputStream in = new FileInputStream
                    (classpath+ File.separator+classpath.replace(",",File.separator).concat(".class"));

            //in.available() 获取数组的长度
            byte[] bytes = new byte[in.available()];

            //读取数组
            in.read(bytes);

            in.close();

            return bytes;

        } catch (Exception e) {
            e.printStackTrace();
            throw new ClassNotFoundException();
        }
    }
}
