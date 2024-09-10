package com.ly.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by ly on 2024/9/9
 */
public class Demo01Servlet implements Servlet {

    //初始化方法 只能调用一次，在servlet创建后由web容器进行调用
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Demo01Servlet被创建了。。");

        //1.通过servletConfig对象来获取ServletContext对象
//        ServletContext servletContext = servletConfig.getServletContext();
//        System.out.println(servletContext);
//
//        //2.获取全局的初始化参数
//        String value = servletContext.getInitParameter("name");
//        System.out.println(value);

        //批量获取
//        Enumeration<String> names = servletContext.getInitParameterNames();
//
//        while(names.hasMoreElements()){
//            String name = names.nextElement();
//            System.out.println("name:"+name);
//            System.out.println("value:"+servletContext.getInitParameter(name));
//        }

        /**
         * 获取任何web资源的绝对路径
         */
        //1.通过servletConfig对象来获取ServletContext对象
//        ServletContext servletContext = servletConfig.getServletContext();
//        System.out.println(servletContext);

        //2.获取任何web资源的绝对路径
//        String realPath = servletContext.getRealPath("1988.jpg");
//        System.out.println(realPath);
//
//        String realPath2 = servletContext.getRealPath("/WEB-INF/web.xml");
//        System.out.println(realPath2);

        /**
         * 域对象
         */
        System.out.println("Demo01Servlet被创建了...");

        //1.通过servletConfig对象来获取ServletContext对象
        ServletContext servletContext = servletConfig.getServletContext();
        System.out.println(servletContext);

        //2.获取任何web资源的绝对路径
        servletContext.setAttribute("address","成都");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Demo01Servelt被访问了");
        res.getWriter().write("hello Demo01Servlet!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("被销毁了。。。");
    }
}
