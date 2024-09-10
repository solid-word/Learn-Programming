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
public class ResponseServlet05 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("ResponseServlet05被访问了。。。。");

        //只需要填写重定向的地址
        resp.sendRedirect("https://www.csdn.net/?spm=1008.2028.3001.4476");
    }
}
