package org.example.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Project: SpringBoot3
 * @Package: org.example.boot.bean
 * @ClassName: Person
 * @Datetime: 2023/06/03 22:47
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "person") // 和配置文件person前缀的所有配置进行绑定
@Data // // 注解自动生成getter、settertoString、、equals和hashCode等方法
// @NoArgsConstructor //自动生成无参构造器
// @AllArgsConstructor //自动生成全参构造器
public class Person {
    private String name;
    private Integer age;
    private Date birthDay;
    private Boolean like;
    private Child child;
    private List<Dog> dogs;
    private Map<String,Cat> cats;
}

