package org.example.web;

/**
 * @Project: Spring-Boot-3
 * @Package: org.example.web
 * @ClassName: Boot304WebApplication
 * @Datetime: 2023/07/09 13:07
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个Spring Boot应用的入口类，用于启动Web应用
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 注解标识这个类是一个Spring Boot应用的入口类，并启用了Spring Boot的自动配置功能
public class Boot304WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot304WebApplication.class, args);
    }

}

