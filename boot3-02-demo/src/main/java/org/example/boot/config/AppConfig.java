package org.example.boot.config;

import org.example.boot.bean.Pig;
import org.example.boot.bean.Sheep;
import org.example.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;


/**
 * @Project: SpringBoot3
 * @Package: com.example.boot.config
 * @ClassName: AppConfig
 * @Datetime: 2023/06/04 00:15
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个名为AppConfig的配置类，用于配置应用程序的组件和属性绑定
 */

/**
 * 1、开启Sheep组件的属性绑定
 * 2、默认会把这个组件自己放到容器中
 */
@EnableConfigurationProperties(Sheep.class) // 导入第三方写好的组件进行属性绑定
// SpringBoot默认只扫描自己主程序所在的包。如果导入第三方包，即使组件上标注了
// @Component、@ConfigurationProperties 注解，也没用。因为组件都扫描不进来
@SpringBootConfiguration // 表示这是一个配置类，替代以前的配置文件，配置类本身也是容器中的组件
// @Configuration

public class AppConfig {

    @Bean
    @ConfigurationProperties(prefix = "pig")
    public Pig pig() {
        return new Pig(); // 我们自己new新pig
    }

    /**
     * 1、组件默认是单实例的
     *
     * @return
     */
    @Scope("prototype")
    @Bean("userHaha") // 替代以前的Bean标签。 组件在容器中的名字默认是方法名，可以直接修改注解的值
    public User user01() {
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        return user;
    }

    // @Bean
    // public FastsqlException fastsqlException(){
    //
    // return new FastsqlException();
    // }
}

