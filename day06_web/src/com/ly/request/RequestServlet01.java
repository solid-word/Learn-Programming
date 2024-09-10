package com.ly.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ly on 2024/9/9
 */
public class RequestServlet01 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("RequestServlet01被访问了。。。");
        //1.获取请求行

        //获取资源请求行  /day06/requestServlet01
        String uri = req.getRequestURI();
        System.out.println("uri:"+uri);

        //完整路径  http://localhost:8080/day06/requestServlet01
        StringBuffer url = req.getRequestURL();
        System.out.println("url:"+url.toString());

        //获取请求方式
        String method = req.getMethod();
        System.out.println("Method请求方式:"+method);

        //获取GET请求的参数  null
        String queryString = req.getQueryString();
        System.out.println("get请求的参数:"+queryString);

        //获取客户端IP和浏览器的端口号
        System.out.println(req.getRemoteAddr()+":"+req.getRemoteHost());

        //动态的获取项目
        System.out.println(req.getContextPath());

    }
}
