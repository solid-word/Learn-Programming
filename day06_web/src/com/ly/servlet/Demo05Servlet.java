package com.ly.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by ly on 2024/9/9
 */
public class Demo05Servlet extends BaseServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Demo05Servlet被访问了。。");

        ServletConfig servletConfig = getServletConfig();
        System.out.println(servletConfig);

        ServletContext servletContext = getServletContext();
        System.out.println(servletContext);

        res.getWriter().write("hello Demo05Servlet!");
    }
}
