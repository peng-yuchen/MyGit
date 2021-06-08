package com.pyc.controller;

import com.pyc.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class FoodController{
    @Autowired
    FoodService service;
    @RequestMapping("hello")
    public String hello(){
        System.out.println(service.test("",""));
        return "car";
    }
    @RequestMapping("testFood")
    public String testFood(HttpServletRequest request, HttpServletResponse response){

        service.test(request.getParameter("rice"),request.getParameter("meat"));
        return "test";
    }
}
