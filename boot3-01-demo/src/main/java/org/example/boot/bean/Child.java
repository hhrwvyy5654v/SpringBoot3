package org.example.boot.bean;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Project: SpringBoot3
 * @Package: org.example.boot.bean
 * @ClassName: Child
 * @Datetime: 2023/06/03 22:48
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */
@Data
public class Child {
    private String name;
    private Integer age;
    private Date birthDay;
    private List<String> text;

    public List<Object> getText() {
        return null;
    }
}

