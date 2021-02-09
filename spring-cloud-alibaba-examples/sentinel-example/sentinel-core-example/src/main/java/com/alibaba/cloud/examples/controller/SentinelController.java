package com.alibaba.cloud.examples.controller;

import com.alibaba.cloud.examples.service.SentinelService;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2021/2/8 0008.
 */
@RestController
public class SentinelController {

    @Autowired
    private SentinelService sentinelService;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) throws BlockException {
        return sentinelService.sayHello(name);
    }

    @GetMapping("/test")
    public String test() {
        return "Hello test";
    }
}
