package com.alibaba.cloud.examples.runner;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.alibaba.nacos.api.config.listener.Listener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * Created by Administrator on 2021/2/7 0007.
 */
@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    private NacosConfigManager nacosConfigManager;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        nacosConfigManager.getConfigService().addListener("nacos-config-example.yaml", "USER_GROUP", new Listener() {
            @Override
            public Executor getExecutor() {
                return null;
            }

            @Override
            public void receiveConfigInfo(String configInfo) {
                Properties properties = new Properties();
                try {
                    properties.load(new StringReader(configInfo));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("config changed: " + properties);
            }
        });
    }
}
