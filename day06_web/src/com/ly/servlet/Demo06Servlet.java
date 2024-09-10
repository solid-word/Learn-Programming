package com.ly.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ly on 2024/9/9
 */
public class Demo06Servlet extends BaseServlet {

    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        System.out.println("get请求。。");
        System.out.println("Demo06Servlet被访问了。。。");
        response.getWriter().write("hello Demo06Servlet!");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Post请求。。");
        System.out.println("Demo06Servlet被访问了。。。");
        response.getWriter().write("hello Demo06Servlet!");
    }
}
