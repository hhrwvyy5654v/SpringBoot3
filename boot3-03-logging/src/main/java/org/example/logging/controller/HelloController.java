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
 * @Description:
 */

@Slf4j
@RestController
public class HelloController {
    @GetMapping("/h/**")
    public String hello(String a, String b) {

        for (int i = 0; i < 1000; i++) {
            log.trace("trace 日志.....");
            log.debug("debug 日志.....");
            // SpringBoot底层默认的日志级别 info
            log.info("info 日志..... 参数a:{} b:{}", a, b);
            log.warn("warn 日志...");
            log.error("error 日志...");
        }
        return "hello";
    }
}

