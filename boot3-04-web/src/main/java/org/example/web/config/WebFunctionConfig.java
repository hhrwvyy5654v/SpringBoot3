package org.example.web.config;

/**
 * @Project: Spring-Boot-3
 * @Package: org.example.web.config
 * @ClassName: WebFunctionConfig
 * @Datetime: 2023/06/04 13:56
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个名为WebFunctionConfig的配置类，使用函数式编程的方式定义了一组处理用户RESTful操作的路由规则，并将其封装为一个RouterFunction<ServerResponse>对象
 */

import org.example.web.biz.UserBizHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

/**
 * 场景：User RESTful - CRUD
 * ● GET /user/1 获取1号用户
 * ● GET /users 获取所有用户
 * ● POST /user 请求体携带JSON，新增一个用户
 * ● PUT /user/1 请求体携带JSON，修改1号用户
 * ● DELETE /user/1 删除1号用户
 */
@Configuration  // 注解标识为一个配置类
public class WebFunctionConfig {
    /**
     * 函数式Web：
     * 1、给容器中放一个Bean：类型是 RouterFunction<ServerResponse>，集中所有路由信息
     * 2、每个业务准备一个自己的Handler
     * <p>
     * <p>
     * 核心四大对象
     * 1、RouterFunction： 定义路由信息。发什么请求，谁来处理
     * 2、RequestPredicate：定义请求规则：请求谓语。请求方式（GET、POST）、请求参数
     * 3、ServerRequest： 封装请求完整数据
     * 4、ServerResponse： 封装响应完整数据
     */
    @Bean
    public RouterFunction<ServerResponse> userRoute(UserBizHandler userBizHandler /* 这个会被自动注入进来 */) {
        // 通过链式调用的方式，定义了以下路由规则
        return RouterFunctions.route()
                // 接收一个id参数，使用userBizHandler的getUser方法处理请求
                .GET("/user/{id}", RequestPredicates.accept(MediaType.ALL), userBizHandler::getUser)
                // 使用userBizHandler的getUsers方法处理请求
                .GET("/users", userBizHandler::getUsers)
                // 接收一个JSON请求体，使用userBizHandler的saveUser方法处理请求
                .POST("/user", RequestPredicates.accept(MediaType.APPLICATION_JSON), userBizHandler::saveUser)
                // 接收一个id参数和JSON请求体，使用userBizHandler的updateUser方法处理请求
                .PUT("/user/{id}", RequestPredicates.accept(MediaType.APPLICATION_JSON), userBizHandler::updateUser)
                // 接收一个id参数，使用userBizHandler的deleteUser方法处理请求
                .DELETE("/user/{id}", userBizHandler::deleteUser)
                // 通过build()方法构建出一个RouterFunction<ServerResponse>对象，并将其作为Bean返回
                .build();
    }
}

