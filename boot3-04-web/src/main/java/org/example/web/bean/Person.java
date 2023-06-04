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
 * @Description:
 */

@JacksonXmlRootElement  // 可以写出为xml文档
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Long id;
    private String username;
    private String email;
    private Integer age;
    private String role;
}

