package org.example.web.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Project: Spring-Boot-3
 * @Package: org.example.web.handler
 * @ClassName: GlobalExceptionHandler
 * @Datetime: 2023/07/09 12:59
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

@ControllerAdvice // 注解标识这个类是一个全局异常处理器，用于统一处理所有@Controller发生的错误
public class GlobalExceptionHandler {
    @ResponseBody // 注解用于将方法的返回值直接写出为JSON格式的响应体
    // 注解用于指定处理特定异常的方法，但在这个全局异常处理器中，我们使用@ControllerAdvice注解来统一处理所有异常，所以这里将@ExceptionHandler注解注释掉了
    // @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {

        return "Ohho~~~统一处理，原因：" + e.getMessage();
    }
}

