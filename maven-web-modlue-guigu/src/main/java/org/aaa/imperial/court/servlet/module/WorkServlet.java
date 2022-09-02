package org.aaa.imperial.court.servlet.module;

import org.aaa.imperial.court.entity.Memorials;
import org.aaa.imperial.court.service.impl.MemorialsServiceImpl;
import org.aaa.imperial.court.service.api.MemorialsService;
import org.aaa.imperial.court.servlet.base.ModelBaseServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author:江Sir
 * @Date:14 2022/08/14 19:50
 * @description: Exercise
 * @Version 1.0.0
 */
public class WorkServlet extends ModelBaseServlet {

    private MemorialsService memorialsService = new MemorialsServiceImpl();

    protected void showMemorialsDigestList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        1.调用数据库查数据
        List<Memorials> memorialsList = memorialsService.getAllMemorialsDigest();

//
        request.setAttribute("memorialsList", memorialsList);

        String templateName = "memorials-list";
        processTemplate(templateName, request, response);
    }

    protected void showMemorialsDetail(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String memorialsId = request.getParameter("memorialsId");

        Memorials memorials = memorialsService.getMemoriasDetailById(memorialsId);
        // 补充功能

        Integer memorialsStatus = memorials.getMemorialsStatus();
        // 判断奏折得到状态
        if(memorialsStatus == 0){
            //更新奏折状态:数据库修改
            memorialsService.updateMemorialsstatusToRead(memorialsId);


            //更新奏折状态:当前状态
            memorials.setMemorialsStatus(1);

        }

        request.setAttribute("memorials",memorials);

//        解析渲染视图
        String templateName = "memorials_detail";
        processTemplate(templateName,request,response);
    }


    protected void feedBack(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String memorialsId = request.getParameter("memorialsId");
        String feedbackContent = request.getParameter("feedbackContent");


        memorialsService.updateMemorialsFeedBack(memorialsId,feedbackContent);
//        重定向
        response.sendRedirect(request.getContextPath() + "/work?method=showMemorialsDigestList");

    }
}
