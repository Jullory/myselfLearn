package com.learn.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan({"com.learn.mall.mbg.mapper","com.learn.mall.dao"})
public class MyBatisConfig {
}
