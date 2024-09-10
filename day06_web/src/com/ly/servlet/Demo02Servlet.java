package com.ly.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by ly on 2024/9/9
 */
public class Demo02Servlet implements Servlet {

    //初始化方法 只能调用一次，在servlet创建后由web容器进行调用
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Demo02Servlet被创建了。。");

        //1.通过servletConfig对象来获取ServletContext对象
        ServletContext servletContext = servletConfig.getServletContext();
        System.out.println(servletContext);

        //2.全局的初始化参数
        Object value = servletContext.getAttribute("address");
        System.out.println(value);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Demo02Servlet被访问了");
        res.getWriter().write("hello Demo02Servlet!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
