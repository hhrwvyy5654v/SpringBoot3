package org.example.web.biz;

import jakarta.servlet.ServletException;
import lombok.extern.slf4j.Slf4j;
import org.example.web.bean.Person;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @Project: Spring-Boot-3
 * @Package: com.example.web.biz
 * @ClassName: UserBizHandler
 * @Datetime: 2023/06/04 03:11
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */
@Slf4j
@Service
public class UserBizHandler {
    //查询指定id的用户
    public ServerResponse getUser(ServerRequest request) throws Exception {
        String id = request.pathVariable("id");
        log.info("查询 【{}】 用户信息，数据库正在检索", id);
        // 业务处理
        Person person = new Person(1L, "哈哈", "aa@qq.com", 18, "admin");
        // 构造响应
        return ServerResponse
                .ok()
                .body(person);
    }

    //获取所有用户
    public ServerResponse getUsers(ServerRequest request) throws Exception {
        log.info("查询所有用户信息完成");
        //业务处理
        List<Person> list = Arrays.asList(new Person(1l, "哈哈", "haha@gmail.com", 18, "admin1"), new Person(2l, "呵呵", "hehe@gmail.com", 12, "admin2"));
        return ServerResponse.ok().body(list);
    }

    //保存用户
    public ServerResponse saveUser(ServerResponse request) throws ServletException, IOException {
        Person body = request.body(Person.class);
        log.info("保存用户信息：{}", body);
        return ServerResponse.ok().build();
    }

    //更新用户
    public ServerResponse updateUser(ServerResponse request) throws ServletException, IOException {
        Person body = request.body(Person.class);
        log.info("保存用户信息更新: {}", body);
        return ServerResponse.ok().build();
    }

    //删除用户
    public ServerResponse deleteUser(ServerRequest request) {
        String id = request.pathVariable("id");
        log.info("删除【{}】用户信息", id);
        return ServerResponse.ok().build();
    }
}

