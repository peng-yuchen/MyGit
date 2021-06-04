package com.pyc.demo01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller     //视图层使用的注解
//@RestController   //json数据使用的注解
public class OpenController {

    //获取值
    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;
    @RequestMapping("open")
    public String open(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(username);
        stringBuffer.append("\t");
        stringBuffer.append(password);
        return stringBuffer.toString();
    }
    @RequestMapping("test1")
    public String test(Model model){
        model.addAttribute("name","pyc");
        return "thymeleaf/index";
    }
}
