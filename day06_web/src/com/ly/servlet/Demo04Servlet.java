package com.ly.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by ly on 2024/9/9
 */
public class Demo04Servlet implements Servlet {
    //定义一个成员变量记住ServletContext对象的内存地址
    private ServletContext servletContext;

    //初始化方法 只能调用一次，在servlet创建后由web容器进行调用
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        ServletContext servletContext = servletConfig.getServletContext();
        this.servletContext=servletContext;

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //如何在Service方法中获取到ServletContext对象的引用?
        System.out.println("Demo4ServletContext被访问了");

        System.out.println(servletContext);

        res.getWriter().write("Hello ServletContext!");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
