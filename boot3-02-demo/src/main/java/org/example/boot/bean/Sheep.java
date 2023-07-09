package org.example.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Project: SpringBoot3
 * @Package: com.example.boot.bean
 * @ClassName: Sheep
 * @Datetime: 2023/06/04 00:13
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个名为Sheep的Java类，用于表示羊的对象
 */

@ConfigurationProperties(prefix = "sheep")  // 表示该类的属性可以从配置中文件读取，配置文件中的属性名以sheep为前缀
public class Sheep {
    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

