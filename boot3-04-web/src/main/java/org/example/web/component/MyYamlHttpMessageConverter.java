package org.example.web.component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @Project: Spring-Boot-3
 * @Package: org.example.web.component
 * @ClassName: MyYamlHttpMessageConverter
 * @Datetime: 2023/06/04 13:21
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个自定义的YAML格式的HTTP消息转换器，用于将对象转换为YAML格式的数据，并将其写入HTTP响应中
 */

// 该类继承自AbstractHttpMessageConverter类，用于处理HTTP请求和响应的消息转换
public class MyYamlHttpMessageConverter extends AbstractHttpMessageConverter<Object> {
    private ObjectMapper objectMapper = null; //把对象转成yaml

    public MyYamlHttpMessageConverter() {
        //告诉SpringBoot这个MessageConverter支持哪种媒体类型  //媒体类型
        super(new MediaType("text", "yaml", StandardCharsets.UTF_8));
        // 创建一个YAMLFactory对象，并禁用了WRITE_DOC_START_MARKER特性
        YAMLFactory factory = new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER);
        // 使用该YAMLFactory创建一个ObjectMapper对象，用于将对象转换为YAML格式
        this.objectMapper = new ObjectMapper(factory);
    }

    @Override
    // 用于判断该消息转换器是否支持给定的类
    protected boolean supports(Class<?> clazz) {
        // 在这里无论是什么类都返回true，表示该消息转换器支持任何类型的对象
        return true;
    }

    @Override
    // 用于从HTTP请求中读取数据
    protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageConversionException {
        // 暂时返回null，表示暂不支持从YAML格式的请求中读取数据
        return null;
    }

    @Override
    // 用于将数据写入HTTP响应
    protected void writeInternal(Object methodReturnValue, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        // 通过获取输出流OutputStream，使用ObjectMapper将方法返回值methodReturnValue转换为YAML格式，并写入输出流中
        try (OutputStream os = outputMessage.getBody()) {
            this.objectMapper.writeValue(os, methodReturnValue);
        }
    }
}

