package com.alibaba.cloud.examples.controller;

import com.alibaba.cloud.examples.config.UserConfig;
import com.alibaba.cloud.nacos.NacosConfigManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2021/2/6 0006.
 */
@RestController
@RefreshScope
public class SampleController {

    @Autowired
    private UserConfig userConfig;

    @Autowired
    private NacosConfigManager nacosConfigManager;

    @Autowired
    private Environment environment;

    @Value("${user.name:wjl}")
    private String userName;

    @Value("${user.age:33}")
    private Integer age;

    @RequestMapping("/user")
    public String simple(){
        return "Hello Nacos Config! Hello " + userName + " " + age
                + userConfig + " " + nacosConfigManager.getConfigService();
    }

    @RequestMapping("/get/{name}")
    public String getValue(@PathVariable String name) {
        return String.valueOf(environment.getProperty(name));
    }

    @RequestMapping("/getMapValue")
    public Object getMapValue() {
        return userConfig.getMap().get("province");
    }
}
