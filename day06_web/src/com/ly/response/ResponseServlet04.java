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
public class ResponseServlet04 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("ResponseServlet04被访问了。。。。");

        //告诉浏览器你需要重定向
        resp.setStatus(302);

        //告诉浏览器重定向的网址
        resp.setHeader("location","https://www.baidu.com");
    }
}
