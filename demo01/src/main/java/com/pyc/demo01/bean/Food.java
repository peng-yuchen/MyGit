package com.pyc.demo01.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Food {
    private String rice;
    private String meat;
    private String[] sauce;

}
