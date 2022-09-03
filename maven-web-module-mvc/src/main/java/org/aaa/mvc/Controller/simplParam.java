package org.aaa.mvc.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:江Sir
 * @Date:03 2022/09/03 15:03
 * @description: Exercise
 * @Version 1.0.0
 */
public class simplParam {
    @RequestMapping("/simpleParam")
    public String simpleParam(Integer id,String username) {
        System.out.println(id);
        System.out.println(username);
        return "/WEB-INF/pages/success.jsp";
    }
}
