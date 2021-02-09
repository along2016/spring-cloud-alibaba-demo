package com.alibaba.cloud.example.controller;

import com.alibaba.cloud.example.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2021/2/6 0006.
 */

@RestController
public class NacosController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EchoService echoService;

    @Autowired
    private DiscoveryClient client;

    /**
     * 通过 restTemplate 调用接口
     * @param str
     * @return
     */
    @GetMapping("/echo-rest/{str}")
    public String rest(@PathVariable String str) {
        return restTemplate.getForObject("http://service-provider/echo/" + str, String.class);
    }

    /**
     * 通过 feign 调用接口
     * @param str
     * @return
     */
    @GetMapping("/echo-feign/{str}")
    public String feign(@PathVariable String str) {
        return echoService.echo(str);
    }

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://service-provider", String.class);
    }

    @GetMapping("/services")
    public Object services(){
       return client.getServices();
    }
}
