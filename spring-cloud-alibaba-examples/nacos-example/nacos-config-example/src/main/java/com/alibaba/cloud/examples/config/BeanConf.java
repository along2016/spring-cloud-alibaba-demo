package com.alibaba.cloud.examples.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2021/2/7 0007.
 */
@Configuration
public class BeanConf {

    @Bean
    public UserConfig userConfig(){
        return new UserConfig();
    }
}
