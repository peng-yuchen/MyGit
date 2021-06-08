package com.pyc.demo01.controller;

import com.pyc.demo01.bean.Food;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class ThymeleafController {
    @RequestMapping("thyme")
    public String thyme(Model model){
        String[] str = new String[3];
        Food food = new Food("拌饭","烤肉",str);

        model.addAttribute("food",food);
        model.addAttribute("name1","<h1>hellooo</h1>");
        model.addAttribute("name2","hellooo");
        return "thymeleaf/index";
    }

    @RequestMapping("welcome")
    public String welcome(Model model){
        model.addAttribute("now",new Date().toString());
        return "thymeleaf/welcome";
    }
}
