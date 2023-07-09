package org.example.boot.bean;

/**
 * @Project: SpringBoot3
 * @Package: com.example.boot.bean
 * @ClassName: Cat
 * @Datetime: 2023/06/04 00:11
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个名为Cat的Java类，用于表示猫的对象
 */

// @Component   // 表示该类是一个Spring组件，可以被自动扫描并注入到Spring容器中
public class Cat {
    private Long id;
    private String name;

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
}

