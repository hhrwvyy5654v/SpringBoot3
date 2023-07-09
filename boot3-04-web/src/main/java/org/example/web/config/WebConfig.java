package org.example.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Project: Spring-Boot-3
 * @Package: org.example.web.config
 * @ClassName: WebConfig
 * @Datetime: 2023/06/04 13:53
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个名为WebConfig的配置类
 */
// 全面接管SpringMVC
// @EnableWebMvc //禁用mvc的默认功能
@Configuration  // 注解标识为一个配置类，并实现了WebMvcConfigurer接口
// WebMvcConfigurer接口是Spring MVC提供的一个配置接口，用于自定义Spring MVC的配置
public class WebConfig implements WebMvcConfigurer {
    // WebConfig类没有添加任何自定义配置，只是一个空的配置类
}

