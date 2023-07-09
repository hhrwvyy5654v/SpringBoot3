package org.example.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: SpringBoot3
 * @Package: com.example.boot.controller
 * @ClassName: HelloController
 * @Datetime: 2023/06/04 00:16
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个名为HelloController的Spring Boot控制器类，用于处理HTTP请求并返回相应的响应
 */

@RestController // 注解表示这是一个控制器类，并且所有的方法都会返回数据而不是视图
public class HelloController {
    @GetMapping("/haha")    // 注解表示该方法处理HTTP GET请求，并映射到路径/haha
    public String hello(){
        return "Hello";
    }
}

