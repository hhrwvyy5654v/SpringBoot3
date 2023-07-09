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
 * @Description: 一个名为UserBizHandler的业务处理类
 */
@Slf4j  // lombok库提供的注解，自动生成一个名为log的日志记录器，用于输出日志信息
@Service    // Spring框架提供的注解，用于标识该类为一个服务类，可以被其他组件注入和调用
// @ServerResponse注解是Spring框架提供的注解，用于构造HTTP响应

public class UserBizHandler {
    //用于查询指定id的用户信息
    public ServerResponse getUser(ServerRequest request) throws Exception {
        // 从请求中获取id参数
        String id = request.pathVariable("id");
        // 输出日志信息
        log.info("查询 【{}】 用户信息，数据库正在检索", id);
        // 构造一个Person对象作为响应体
        Person person = new Person(1L, "哈哈", "aa@qq.com", 18, "admin");
        // 返回给客户端
        return ServerResponse
                .ok()
                .body(person);
    }

    //用于获取所有用户信息
    public ServerResponse getUsers(ServerRequest request) throws Exception {
        // 输出日志信息
        log.info("查询所有用户信息完成");
        // 构造一个包含多个Person对象的列表作为响应体
        List<Person> list = Arrays.asList(new Person(1L, "哈哈", "haha@gmail.com", 18, "admin1"), new Person(2L, "呵呵", "hehe@gmail.com", 12, "admin2"));
        // 返回给客户端
        return ServerResponse.ok().body(list);
    }

    // 用于保存用户信息
    public ServerResponse saveUser(ServerResponse request) throws ServletException, IOException {
        // 从请求体中提取Person对象
        Person body = request.body(Person.class);
        // 输出日志信息
        log.info("保存用户信息：{}", body);
        // 返回一个表示保存成功的HTTP响应
        return ServerResponse.ok().build();
    }

    // 用于更新用户信息
    public ServerResponse updateUser(ServerResponse request) throws ServletException, IOException {
        // 从请求中获取id参数
        Person body = request.body(Person.class);
        // 输出日志信息
        log.info("保存用户信息更新: {}", body);
        // 返回一个表示更新成功的HTTP响应
        return ServerResponse.ok().build();
    }

    // 用于删除用户信息
    public ServerResponse deleteUser(ServerRequest request) {
        // 从请求路径中获取要删除的用户的id
        String id = request.pathVariable("id");
        // 输出日志信息
        log.info("删除【{}】用户信息", id);
        // 返回一个表示删除成功的HTTP响应
        return ServerResponse.ok().build();
    }
}

