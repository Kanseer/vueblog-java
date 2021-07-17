package com.kang.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author kanseer
 * @create 2021-04-05 12:20
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.kang.mapper")
public class MybatisPlusConfig {

    //PaginationInterceptor 分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
