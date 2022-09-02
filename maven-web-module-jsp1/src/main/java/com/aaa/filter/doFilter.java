package com.aaa.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:江Sir
 * @Date:17 2022/08/17 19:53
 * @description: Exercise
 * @Version 1.0.0
 */
//@WebFilter("/maven_web_module_jsp1_war_exploded/*")
public class doFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("encoding.init");
    }

    @Override
    public void doFilter(ServletRequest sreq, ServletResponse srep, FilterChain filterChain) throws IOException, ServletException {
        sreq.setCharacterEncoding("utf-8");
//        HttpServletRequest request = (HttpServletRequest) sreq;
//        HttpServletResponse resopse = (HttpServletResponse) srep;
//        System.out.println("你好Filter");
        srep.setContentType("text/html;charset=utf-8");
//        System.out.println("在doFilter之前吗？");
//        filterChain.doFilter(sreq,srep);
//        System.out.println("request.getSession().getAttribute(\"user\") != null"+request.getSession().getAttribute("user") == null);
//        if(request.getSession().getAttribute("user") == null){
//            resopse.sendRedirect("/maven_web_module_jsp1_war_exploded/");
//        }else {
//            resopse.sendRedirect("/maven_web_module_jsp1_war_exploded/Welcome");

//        }
        filterChain.doFilter(sreq,srep);
//        System.out.println("在doFilter之后吗？");


    }

    @Override
    public void destroy() {
        System.out.println("encoding.destroy");
    }
}
