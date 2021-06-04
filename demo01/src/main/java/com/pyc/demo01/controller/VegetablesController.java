package com.pyc.demo01.controller;

import com.pyc.demo01.bean.Vegetables;
import com.pyc.demo01.config.VegetablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VegetablesController {
    //注入
    @Autowired
    private VegetablesConfig vegetablesConfig;

    @RequestMapping("test")
    public Vegetables test(){
        Vegetables vegetables = new Vegetables();
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenPePer(vegetablesConfig.getGreenPePer());
        vegetables.setPotato(vegetablesConfig.getPotato());
        System.out.println(vegetables.toString());
        return vegetables;
    }
}
