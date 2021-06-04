package com.pyc.demo01.controller;

import com.pyc.demo01.bean.Food;
import com.pyc.demo01.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//返回json字符串，而不是视图
public class JsonController {

//自动注入我们配置好的FoodConfig
    @Autowired
    private FoodConfig foodConfig;
    @RequestMapping("json")
    public Food json(){
        Food food = new Food(foodConfig.getRice(),foodConfig.getMeat(),foodConfig.getSauce());
//        food.setRice(foodConfig.getRice());
//        food.setMeat(foodConfig.getMeat());
//        food.setSauce(foodConfig.getSauce());
        return food;
    }
}
