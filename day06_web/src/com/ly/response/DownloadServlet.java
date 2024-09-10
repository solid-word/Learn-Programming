package com.ly.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * Created by ly on 2024/9/9
 */
public class DownloadServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("文件下载服务器被访问了..。");

        //1.从文件的磁盘读取文件
        FileInputStream in = new FileInputStream("E:\\K\\1988.jpg");

        //告诉浏览器以下载的方式打开文件  如果有中文，处理乱码
        resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode("服务器.zip","UTF-8"));

        //2.通过response获取字节输出流
        OutputStream out = resp.getOutputStream();

        //3.流的模板代码
        byte[] buffer = new byte[1024];
        int len = 0;

        while((len=in.read(buffer))>0){
            //写出数据
            out.write(buffer,0,len);
        }

        //关闭资源，自己创建的才关，如果这里关了，tomcat再去关会出问题
        in.close();
    }

}
