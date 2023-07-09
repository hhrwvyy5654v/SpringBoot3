package org.example.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Project: Spring-Boot-3
 * @Package: org.example.boot
 * @ClassName: Boot303LoggingApplication
 * @Datetime: 2023/07/07 19:42
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个Spring Boot应用程序的入口类
 */


@SpringBootApplication  // 该注解是一个组合注解，它包含了多个注解的功能。它包括了@Configuration注解，表示这个类是一个配置类；
public class Boot303LoggingApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot303LoggingApplication.class, args);
    }

}

