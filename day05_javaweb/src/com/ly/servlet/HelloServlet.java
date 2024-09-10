package com.ly.servlet;

import java.io.*;
import javax.servlet.*;


//1. 编写一个类实现Servlet接口
//2. 我们首先编写了一个Servlet实现类，实现类怎么创建对象，这些方法谁来进行调用
//3. 谁来创建对象谁来调用？Web服务器
public class HelloServlet implements Servlet {


    //初始化方法 初始化的时候被调用一次
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("被初始化了。。");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Hello Servlet被调用了");
        res.getWriter().write("hello");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    //销毁的方法  Servlet被销毁之前调用
    @Override
    public void destroy() {
        System.out.println("被销毁了。。。");
    }
}