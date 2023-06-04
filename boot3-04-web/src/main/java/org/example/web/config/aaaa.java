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
 * @Description:
 */

@Component("Aaaa")
public class aaaa implements View {
    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getWriter().write("aaaa");
    }
}

