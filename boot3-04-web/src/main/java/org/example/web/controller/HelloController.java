package org.example.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.example.web.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * @Project: Spring-Boot-3
 * @Package: org.example.web.controller
 * @ClassName: HelloController
 * @Datetime: 2023/06/04 14:16
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个Spring Boot的控制器类，用于处理HTTP请求
 */

@Slf4j  // lombok库提供的注解，用于自动生成一个名为log的日志记录器
@RestController // 注解标识为一个控制器，表示该类中的方法都是处理HTTP请求的方法，并且返回的结果会直接作为响应体返回给客户端

public class HelloController {
    @Autowired  // 注解将MessageSource对象自动注入到该类中
    MessageSource messageSource;    // 获取国际化配置文件中指定配置项的值

    // 定义一个静态方法
    public static void aaa(String[] args) throws JsonProcessingException {
        // 将一个Person对象转换为YAML格式的字符串
        Person person = new Person();
        person.setId(1L);
        person.setUserName("张三");
        person.setEmail("aaa@qq.com");
        person.setAge(18);

        YAMLFactory factory = new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER);
        ObjectMapper mapper = new ObjectMapper(factory);

        String s = mapper.writeValueAsString(person);
        System.out.println(s);
    }

    @GetMapping("/a*/b?/**/{p1:[a-f]+}/**") // 注解标识为处理GET请求的方法，映射的路径是/a*/b?//{p1:[a-f]+}/
    // 定义一个处理GET请求的方法
    public String hello(HttpServletRequest request, @PathVariable("p1") String path) {
        // 接收一个HttpServletRequest对象和一个路径变量p1，并返回一个字符串
        log.info("路径变量p1： {}", path);
        // 打印路径变量p1的值
        String uri = request.getRequestURI();
        // 返回请求的URI
        return uri;
    }

    @GetMapping("/person")  // 注解标识为处理GET请求的方法，映射的路径是/person
    // 定义一个处理GET请求的方法
    public Person person() {
        Person person = new Person();
        person.setId(1L);
        person.setUserName("张三");
        person.setEmail("aaa@qq.com");
        person.setAge(18);
        // 返回一个Person对象，用于演示将对象转换为JSON格式的响应
        return person;
    }

    @GetMapping("/haha")    // 注解标识为处理GET请求的方法，映射的路径是/haha
    // 定义一个处理GET请求的方法
    public String haha(HttpServletRequest request) {
        Locale locale = request.getLocale();
        //利用代码的方式获取国际化配置文件中指定的配置项的值
        String login = messageSource.getMessage("login", null, locale);
        // 返回上述获取的值
        return login;
    }
}


