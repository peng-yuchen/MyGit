package com.pyc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class Car {
    private String id;
    private String cname;
    private String color;
    private int price;
}
