package com.pyc.service;


import com.pyc.bean.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    private Food food;
    @Autowired
    public void setFood(Food food){
        this.food = food;
    }
    public String test(String rice,String meat){
        System.out.println(food);
        food.setRice(rice);
        if("烤肉".equals(meat)){
            int i= 1/0;
            food.setMeat(meat);
        }

        System.out.println(food);

        return "test";
    }
}

