package com.pyc.demo01.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {
    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("111@!#");//加盐
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("root");

        System.out.println(username);
        System.out.println(password);
    }
}
