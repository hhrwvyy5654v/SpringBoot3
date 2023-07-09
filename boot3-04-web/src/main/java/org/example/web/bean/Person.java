package org.example.web.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project: Spring-Boot-3
 * @Package: com.example.web.bean
 * @ClassName: Person
 * @Datetime: 2023/06/04 03:01
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个名为Person的Java类
 */

@JacksonXmlRootElement  // 注解表示该类可以被写出为XML文档
@Data   // lombok库提供的注解，可以自动生成一些常用的方法
@AllArgsConstructor // lombok库提供的注解，可以自动生成一个包含所有字段的构造函数
@NoArgsConstructor  // lombok库提供的注解，可以自动生成一个无参构造函数
public class Person {
    private Long id;    //人员ID
    private String username;    // 用户名
    private String email;   // 电子邮件
    private Integer age;    // 年龄
    private String role;    // 角色
}

