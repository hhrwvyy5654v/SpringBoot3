package org.example.boot.bean;

import lombok.Data;

/**
 * @Project: SpringBoot3
 * @Package: org.example.boot.bean
 * @ClassName: Dog
 * @Datetime: 2023/06/03 22:48
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个名为Dog的Java类，用于表示狗的信息
 */
@Data   // 注解自动生成getter、settertoString、、equals和hashCode等方法
public class Dog {
    private String name;
    private Integer age;
}

