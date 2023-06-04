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
 * @Description:
 */

@RestController
public class HelloController {
    @GetMapping("/haha")
    public String hello(){
        return "Hello";
    }
}

