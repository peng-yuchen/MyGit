package com.pyc.demo01.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * vegetables.potato=土豆
 * vegetables.eggplant=茄子
 * vegetables.greenPePer=青椒
 * */
@Configuration//声明这是一个配置类，@Configuration有@Component注解，不用在入口类告诉Springboot也可以被扫描到
@ConfigurationProperties(prefix = "vegetables")//声明这是一个配置文件类
@PropertySource("classpath:vegetables.properties")//指定位置
public class VegetablesConfig {
    private String potato;
    private String eggplant;
    private String greenPePer;

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getGreenPePer() {
        return greenPePer;
    }

    public void setGreenPePer(String greenPePer) {
        this.greenPePer = greenPePer;
    }
}
