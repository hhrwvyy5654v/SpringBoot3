package org.example.boot;

import com.alibaba.druid.FastsqlException;
import org.example.boot.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Project: SpringBoot3
 * @Package: com.example.boot
 * @ClassName: Boot302DemoApplication
 * @Datetime: 2023/06/03 23:27
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个Spring应 Boot用的主程序入口，它启动了Spring Boot应用，并展示了容器中组的件及对它们的操作
 */
@SpringBootApplication
public class Boot302DemoApplication {

    public static void main(String[] args) {
        org.springframework.context.ConfigurableApplicationContext ioc = SpringApplication.run(Boot302DemoApplication.class, args);

        for (String name : ioc.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        String[] forType = ioc.getBeanNamesForType(FastsqlException.class);
        for (String s : forType) {
            System.out.println(s);
        }

        Object userHaha1 = ioc.getBean("userHaha");
        Object userHaha2 = ioc.getBean("userHaha");
        System.out.println(userHaha2 == userHaha1);

        for (String s : ioc.getBeanNamesForType(Cat.class)) {
            System.out.println("cat: " + s);
        }

        for (String s : ioc.getBeanNamesForType(Dog.class)) {
            System.out.println("dog: " + s);
        }

        for (String s : ioc.getBeanNamesForType(User.class)) {
            System.out.println("user: " + s);
        }


        Pig pig = ioc.getBean(Pig.class);
        System.out.println("pig: " + pig);


        Sheep sheep = ioc.getBean(Sheep.class);
        System.out.println("sheep: " + sheep);
    }
}

