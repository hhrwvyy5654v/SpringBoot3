package org.example.boot.bean;

/**
 * @Project: SpringBoot3
 * @Package: com.example.boot.bean
 * @ClassName: Dog
 * @Datetime: 2023/06/04 00:12
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

public class Dog {
    private  Long id;
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

