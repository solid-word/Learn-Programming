package com.ly.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by ly on 2024/9/9
 */
public class IndexServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("IndexServlet被访问了");

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");


        PrintWriter writer = resp.getWriter();

        writer.write("<html>\n" +
                "<head>\n" +
                "  <title>JSP - Hello World</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Hello World!</h1>\n" +
                "<h2>当前服务器的时间:2024-09-09"+"\n"+
                new Date().toLocaleString()+"</h2>" +
                "<br/>\n" +
                "<a href=\"hello-servlet\">Hello Servlet</a>\n" +
                "</body>\n" +
                "</html>\n");
    }
}
