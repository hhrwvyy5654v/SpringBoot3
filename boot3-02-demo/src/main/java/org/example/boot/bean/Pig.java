package org.example.boot.bean;

/**
 * @Project: SpringBoot3
 * @Package: com.example.boot.bean
 * @ClassName: Pig
 * @Datetime: 2023/06/04 00:13
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

// @Component   // 表示该类是一个Spring组件，可以被自动扫描并注入到Spring容器中
public class Pig {
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
        return "Pig{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

