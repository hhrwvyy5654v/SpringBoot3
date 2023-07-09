package org.example.web.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import java.util.Map;

/**
 * @Project: Spring-Boot-3
 * @Package: org.example.web.config
 * @ClassName: aaaa
 * @Datetime: 2023/06/04 13:29
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 定义一个名为aaaa的自定义视图，当请求使用该视图时，会将字符串"aaaa"作为响应返回给客户端
 */

@Component("Aaaa") // 注解表示将该类作为一个组件进行管理，其中"Aaaa"是该组件的名称
// 该类实现了View接口，用于自定义视图的渲染
public class aaaa implements View {
    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 通过response.getWriter()获取输出流，然后使用write方法将字符串"aaaa"写入响应中。
        response.getWriter().write("aaaa");
    }
}

