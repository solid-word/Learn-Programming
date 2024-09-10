package com.ly.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by ly on 2024/9/9
 */
public class RequestServlet02 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("RequestServlet02被访问了。。。");

        //1.获取请求行
        String value = req.getHeader("accept");
        System.out.println(value);

        //2.批量获取
        Enumeration<String> headerNames = req.getHeaderNames();

        while(headerNames.hasMoreElements()){
            String headName = String.valueOf(headerNames.hasMoreElements());
            System.out.println("name:"+headName+":value:"+req.getHeader(headName));
        }


    }
}
