package org.aaa.maven;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @Author:江Sir
 * @Date:12 2022/08/12 20:10
 * @description: Exercise
 * @Version 1.0.0
 */
@WebServlet(urlPatterns = "/demo3",loadOnStartup = 1)
public class ServletDemo implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化加载……init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("加载service……");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("死亡……destroy");
    }
}
