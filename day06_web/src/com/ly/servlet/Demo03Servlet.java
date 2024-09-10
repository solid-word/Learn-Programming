package com.ly.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by ly on 2024/9/9
 */
public class Demo03Servlet implements Servlet {

    //初始化方法 只能调用一次，在servlet创建后由web容器进行调用
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Demo03Servlet被创建了。。");

        System.out.println(servletConfig);

        //1.获取ServletContext的引用
        ServletContext servletContext = servletConfig.getServletContext();
        System.out.println(servletContext);

        //2.获取servlet的名字
        System.out.println(servletConfig.getServletName());

        //3.获取Servlet的初始化参数
        String value = servletConfig.getInitParameter("name");
        System.out.println(value);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Demo03Servelt被访问了");
        res.getWriter().write("hello Demo03Servlet!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
