package com.pyc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@Data
@AllArgsConstructor@NoArgsConstructor
public class Food {
    private String rice;
    private String meat;

}
