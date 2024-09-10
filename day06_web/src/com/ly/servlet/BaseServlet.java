package com.ly.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ly on 2024/9/9
 */
public  abstract class BaseServlet implements Servlet {

    //定义一个变量记住ServletConfig内存地址
    private ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig=servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    /**
     * 方便子类获取ServletContext对象的引用
     * @return
     */
    public ServletContext getServletContext(){
        return servletConfig.getServletContext();
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //ServletRequest->HttpServletRequest->HttpServletRequestImpl

        //向下转型
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        //调用重载的service方法
        this.service(request,response);
    }

    //子类今后只需要直接覆盖重载的service方法
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {

        //请求方法 get post
        String method = request.getMethod();

        if (method.equalsIgnoreCase("get")){
            doGet(request,response);
        }else {
            doPost(request,response);
        }
    }


    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {}

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {}
    @Override
    public String getServletInfo() {
        return servletConfig.getServletName();
    }

    @Override
    public void destroy() {

    }
}
