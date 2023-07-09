package org.example.boot;

import lombok.var;
import org.example.boot.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Project: SpringBoot3
 * @Package: org.example.boot
 * @ClassName: MainApplication
 * @Datetime: 2023/06/03 22:58
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个Spring Boot应用的主程序入口，它启动了 BootSpring应用展并示了容器中的组件及以对自定义Java Bean的使用
 */


//主程序：com.atguigu.boot
//@SpringBootApplication(scanBasePackages = "com.atguigu")
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("com.atguigu")


@SpringBootApplication //这是一个SpringBoot应用
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);

        //java10： 局部变量类型的自动推断
        var ioc = SpringApplication.run(MainApplication.class, args);

        //1、获取容器中所有组件的名字
        String[] names = ioc.getBeanDefinitionNames();
        //2、挨个遍历：
        // dispatcherServlet、beanNameViewResolver、characterEncodingFilter、multipartResolver
        // SpringBoot把以前配置的核心组件现在都给我们自动配置好了。
        for (String name : names) {
            System.out.println(name);
        }


        Person person = ioc.getBean(Person.class);
        System.out.println("person：" + person);
        System.out.println("==== 用|表示大文本，会保留格式");
        String s = (String) person.getChild().getText().get(2);
        System.out.println(s);
        System.out.println("==== 用>表示大文本，会压缩换行变成 空格");
        var ss = person.getChild().getText().get(3);
        System.out.println(ss);

        System.out.println("==== 用|表示大文本，会压缩换行变成 空格");
        var ss2 = person.getChild().getText().get(4);
        System.out.println(ss2);
    }
}

