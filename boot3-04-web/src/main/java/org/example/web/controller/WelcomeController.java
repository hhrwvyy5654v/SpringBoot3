package org.example.web.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.example.web.bean.Person;
import org.example.web.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

/**
 * @Project: Spring-Boot-3
 * @Package: org.example.web.controller
 * @ClassName: WelcomeController
 * @Datetime: 2023/06/04 14:16
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个Spring MVC的控制器类，用于处理HTTP请求并返回相应的视图
 */

@Controller // 注解标识这个类是一个控制器，表示该类中的方法都是处理HTTP请求的方法，并返回相应的视图
public class WelcomeController {
    // 使用@Autowired注解，将AService对象自动注入到该类中
    @Autowired
    AService aService;

    @GetMapping("/well")    // 定义一个处理GET请求的方法,映射的路径是/well
    // 接收一个名为name的请求参数，并将其值存储在Model对象中
    public String hello(@RequestParam("name") String name, Model model, HttpServletRequest request) {
        // 模板的逻辑视图名
        // 物理视图=前缀+逻辑视图名+后缀
        // 真实地址=classpath:/templates/welcome.html

        // 把需要给页面共享的数据放到model中

        String text = "<span style='color:red'>" + name + "</span>";
        model.addAttribute("msg", text);

        model.addAttribute("name", name);

        aService.a();
        // 路径是动态的
        model.addAttribute("imgUrl", "/4.jpg");
        // 数据库查出的样式
        model.addAttribute("style", "width: 400px");
        model.addAttribute("show", false);
        // 返回一个名为"welcome"的逻辑视图名
        return "welcome";
    }

    @GetMapping("/")    // 定义一个处理GET请求的方法,映射的路径是"/"
    public String index() {
        // 返回一个名为"index"的逻辑视图名
        return "index";
    }

    @GetMapping("/list")    // 定义一个处理GET请求的方法,映射的路径是/list
    public String list(Model model) {
        // 在Model对象中存储了一个名为"persons"的属性
        List<Person> list = Arrays.asList(
                new Person(1L, "张三1", "", 15, "pm"),
                new Person(3L, "张三2", "zs2@qq.com", 16, "pm"),
                new Person(4L, "张三333", "zs3@qq.com", 17, "pm"),
                new Person(7L, "张三444", "zs4@qq.com", 18, "admin"),
                new Person(8L, "张三5", "zs5@qq.com", 19, "hr"));

        model.addAttribute("persons", list);

        // 返回一个名为"list"的逻辑视图名
        return "list";
    }
}

