package com.yuntian.spring.web;

import com.yuntian.spring.base.Result;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: yuntian
 * @Date: 2019/9/1 0001 20:43
 * @Description: Spring 2.5为MVC控制器引入了基于注释的编程模型
 */
@Controller
@RequestMapping("/test")
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    @ResponseBody
    public Result helloWorld() {
        Result result=new Result();
        result.setCode(99);
        result.setMsg("成功");
        return result;
    }

    @RequestMapping("/showMessage")
    public String showMessage(Model model) {
        model.addAttribute("message", "Hello World!");
        return "showMessage";
    }

}
