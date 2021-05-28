package com.tasion.userserver.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.tasion.userserver.mapper")
public class MyBatisConfig {
}
