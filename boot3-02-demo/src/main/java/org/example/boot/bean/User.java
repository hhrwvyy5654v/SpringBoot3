package org.example.boot.bean;

/**
 * @Project: SpringBoot3
 * @Package: com.example.boot.bean
 * @ClassName: User
 * @Datetime: 2023/06/04 00:14
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

public class User {
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

