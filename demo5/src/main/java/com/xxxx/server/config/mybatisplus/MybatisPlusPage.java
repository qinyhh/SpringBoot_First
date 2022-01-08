package com.xxxx.server.config.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 分页配置
 * @Author qinyh
 * @date 2022/1/8
 */
@Configuration
public class MybatisPlusPage {

    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor(){

        return new PaginationInnerInterceptor();
    }

}
