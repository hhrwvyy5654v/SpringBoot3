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
 * @Description:
 */
// 全面接管SpringMVC
// @EnableWebMvc //禁用mvc的默认功能
@Configuration
public class WebConfig implements WebMvcConfigurer {
}

