package org.example.web.config;

import org.example.web.component.MyYamlHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Project: Spring-Boot-3
 * @Package: org.example.web.config
 * @ClassName: MyConfig
 * @Datetime: 2023/06/04 13:42
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个名为MyConfig的配置类，用于自定义Spring MVC的配置，包括静态资源处理、拦截器配置和消息转换器配置
 */
// @EnableWebMvc //禁用boot的默认配置
@Configuration // 注解标识为一个配置类，用于自定义Spring MVC的配置
public class MyConfig /* implements WebMvcConfigurer */ {
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        // 通过匿名内部类的方式实现了WebMvcConfigurer接口
        return new WebMvcConfigurer() {
            @Override
            // 用于配置静态资源的处理
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                // 将/static/**路径映射到classpath:/a/和classpath:/b/下的静态资源，并设置缓存控制策略
                registry.addResourceHandler("/static/**")
                        .addResourceLocations("classpath:/a/", "classpath:/b/")
                        .setCacheControl(CacheControl.maxAge(1180, TimeUnit.SECONDS));
            }

            @Override
            // 用于配置拦截器
            public void addInterceptors(InterceptorRegistry registry) {
                // 未添加任何拦截器
            }

            @Override
            // 用于配置消息转换器
            public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
                // 添加了一个自定义的MyYamlHttpMessageConverter，用于将对象转换为YAML格式
                converters.add(new MyYamlHttpMessageConverter());
            }
        };
    }
}

