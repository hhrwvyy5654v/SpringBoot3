package org.example.boot.config;

import org.example.boot.bean.Cat;
import org.example.boot.bean.Dog;
import org.example.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;

/**
 * @Project: SpringBoot3
 * @Package: com.example.boot.config
 * @ClassName: AppConfig2
 * @Datetime: 2023/06/04 00:15
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个名为AppConfig2的配置类，用于根据条件来配置应用程序的组件
 */

// 表示当类路径中不存在com.alibaba.druid.FastsqlException类时，才会生效整个配置类
@ConditionalOnMissingClass(value = "com.alibaba.druid.FastsqlException")
@SpringBootConfiguration    // 一个注解，用于标识一个类是Spring Boot的配置类

public class AppConfig2 {

    //注解表示当类路径中存在com.alibaba.druid.FastsqlException类时才会创建Cat对象
    @ConditionalOnClass(name = "com.alibaba.druid.FastsqlException")
    @Bean   // 注解用于标识该方法是一个Bean的定义方法
    public Cat cat01() {
        return new Cat();
    }


    @Bean   // 注解用于标识该方法是一个Bean的定义方法
    // 未使用条件注解，表示无论什么条件都会创建Dog对象
    public Dog dog01() {
        return new Dog();
    }

    // 使用了@ConditionalOnBean(value = Dog.class)注解，表示当容器中存在Dog对象时才会创建User对象
    @ConditionalOnBean(value = Dog.class)
    @Bean   // 注解用于标识该方法是一个Bean的定义方法
    public User zhangsan() {
        return new User();
    }


    // 表示当容器中不存在Dog对象时才会创建User对象
    @ConditionalOnMissingBean(value = Dog.class)
    @Bean   // 注解用于标识该方法是一个Bean的定义方法
    public User lisi() {
        return new User();
    }
}
