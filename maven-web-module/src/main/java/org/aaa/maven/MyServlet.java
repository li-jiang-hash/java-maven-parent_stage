package org.aaa.maven;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author:江Sir
 * @Date:13 2022/08/13 09:10
 * @description: Exercise
 * @Version 1.0.0
 */
@WebServlet(urlPatterns = "/my",loadOnStartup = 1)
public abstract class MyServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化……init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest HSR = (HttpServletRequest) servletRequest;
        String method = HSR.getMethod();
//        method
        if (method.equalsIgnoreCase("GET")) {
//            System.out.println("GET");
            doGet(servletRequest, servletResponse);
        } else if (method.equalsIgnoreCase("POST")) {
//            System.out.println("POST");
            doPost(servletRequest, servletResponse);
        } else if (method.equalsIgnoreCase("HEAD")) {
            System.out.println("HEAD");
        } else if (method.equalsIgnoreCase("PUT")) {
            System.out.println("PUT");
        }

    }

    protected abstract void doGet(ServletRequest servletRequest, ServletResponse servletResponse);

    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {

    }


    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

}
