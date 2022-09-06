package org.aaa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:江Sir
 * @Date:05 2022/09/05 20:34
 * @description: Exercise
 * @Version 1.0.0
 */
@Controller
public class ControllerAPI {
    @RequestMapping("/")
    public String index() {
//设置视图名称
        return "index";
    }

}
//    @RequestMapping("/mav")
//    public ModelAndView getMAV(){
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("testText","asdfghjkjl");
//        mav.setViewName("success");
//        return mav;
//    }
//}
