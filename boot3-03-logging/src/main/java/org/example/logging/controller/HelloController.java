package org.example.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: Spring-Boot-3
 * @Package: org.example.logging.controller
 * @ClassName: HelloController
 * @Datetime: 2023/06/04 02:40
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个使用Slf4j和Lombok库的Java控制器类
 */

@Slf4j  // Lombok库提供的一个注解，会在编译时自动生成一个名为"log"的Slf4j日志记录器对象，用于在代码中记录日志
@RestController // 注解将该类标记为一个RESTful控制器，表示该类中的方法可以处理HTTP请求并返回响应
public class HelloController {
    @GetMapping("/h/**")    // 一个名为hello的方法，使用@GetMapping注解将该方法映射到路径"/h/**"，表示当收到以"/h/"开头的HTTP GET请求时，将调用该方法
    public String hello(String a, String b) {
        // 使用一个循环来模拟日志输出
        for (int i = 0; i < 1000; i++) {
            // 使用log对象记录不同级别的日志信息，包括trace、debug、info、warn和error
            log.trace("trace 日志.....");
            log.debug("debug 日志.....");
            // SpringBoot底层默认的日志级别 info
            log.info("info 日志..... 参数a:{} b:{}", a, b);
            log.warn("warn 日志...");
            log.error("error 日志...");
        }
        return "hello"; // 返回字符串"hello"作为响应
    }
}

