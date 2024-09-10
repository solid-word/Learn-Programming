package com.ly.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ly on 2024/9/9
 */
public class ResponseServlet02 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("ResponseServlet02被访问了。。。。");

        //响应头
        //addHeader设置响应头得时候如果key相同，不会覆盖
//         resp.addHeader("sever","mySever");
//         resp.addHeader("sever","mySever2");

        //setHeader会覆盖
        resp.setHeader("sever","mySever");
        resp.setHeader("sever","mySever2");

        //设置几秒后跳转到CSDN
//        resp.addHeader("Refresh","9;https://www.csdn.net/?spm=1008.2028.3001.4476");
    }
}
