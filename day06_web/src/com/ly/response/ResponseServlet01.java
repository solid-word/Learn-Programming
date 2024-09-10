package com.ly.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ly on 2024/9/9
 */
public class ResponseServlet01 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("ResponseServlet01被访问了。。。。");

        //设置响应头  找不到资源
        //resp.setStatus(404);

        //200 404 304   500不需要人工干预 web服务器自动设置

        int x = 1 / 0;
        //响应头

    }
}
