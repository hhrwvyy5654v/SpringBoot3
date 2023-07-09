package org.example.web.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @Project: Spring-Boot-3
 * @Package: org.example.web.service
 * @ClassName: AService
 * @Datetime: 2023/07/09 12:59
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个服务类，提供了一个方法用于执行业务逻辑
 */

@Service    // 注解标识这个类是一个服务类，用于提供业务逻辑处理
public class AService {
    // 方法名为"a"，用于执行一些业务逻辑
    public void a() {
        // 通过RequestContextHolder.getRequestAttributes()方法获取到当前请求的属性对象ServletRequestAttributes
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        // 通过该对象可以获取到当前请求和响应的信息，包括请求的URI
        HttpServletResponse response = attributes.getResponse();
        HttpServletRequest request = attributes.getRequest();
        // 获取了当前请求的URI并将其存储在requestURI变量中
        String requestURI = request.getRequestURI();
    }
}