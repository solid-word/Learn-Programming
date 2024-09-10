package com.ly.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ly on 2024/9/9
 */
public class ResponseServlet03 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("ResponseServlet03被访问了。。。。");

        //1.设置字符输出流编码UTF-8
        //查看编码
        System.out.println(resp.getCharacterEncoding());

        //设置编码
        //resp.setCharacterEncoding("UTF-8");

        //2.告诉浏览器我返回给你的是一个html正文，以UTF-8编码打开
        //浏览器检查到这个头后用UTF-8的格式打开
        //resp.addHeader("content-type","text/html;charset=utf-8");
        //简化写法
        resp.setContentType("text/html;charset=utf-8");

        //获取字符输出流，设置响应的正文
        PrintWriter writer = resp.getWriter();

        writer.write("班长hhh");
    }
}
