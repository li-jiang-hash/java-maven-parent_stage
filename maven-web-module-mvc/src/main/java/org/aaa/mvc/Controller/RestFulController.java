package org.aaa.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:江Sir
 * @Date:05 2022/09/05 15:52
 * @description: Exercise
 * @Version 1.0.0
 */
@Controller
@RequestMapping("/q")
public class RestFulController {
    @GetMapping(value = "/user/{id}")
    // 相当于 @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)// @ResponseBody
    public String get(@PathVariable Integer id) {

     return "get：" + id;
    }

    @PostMapping(value = "/user")
    @ResponseBody
    public String post() {
        return "post";
    }

    @PutMapping(value = "/user")
    @ResponseBody
    public String put() {
        return "put";
    }

    @DeleteMapping(value = "/user/{id}")
    @ResponseBody
    public String delete(@PathVariable Integer id) {
        return "delete：" + id;
    }
}
