package org.example.boot;

/**
 * @Project: Spring-Boot-3
 * @Package: org.example.boot
 * @ClassName: Boot02HelloworldApplicationTests
 * @Datetime: 2023/07/07 00:21
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个用于测试Spring Boot应用上下文加载的测试类
 */

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // 注解表示这是一个Spring Boot的测试类，并且会加载整个应用程序的上下文
class Boot02HelloworldApplicationTests {

    @Test
        // 一个名为contextLoads()的测试方法，该方法为空，没有任何测试逻辑
    void contextLoads() {
    }

}


