package com.alibaba.cloud.examples.service;

import com.alibaba.cloud.examples.utils.ExceptionUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2021/2/8 0008.
 */
@Service
public class SentinelService {

    @SentinelResource(value = "/hello", blockHandler = "handleException",
            blockHandlerClass = {ExceptionUtil.class}, fallback = "helloFallback")
    public String sayHello(String name) {
        return "hello " + name;
    }

    public String helloFallback(String name, Throwable ex) {
        // Do some log here.
        ex.printStackTrace();
        return "Oops, error occurred at " + name;
    }
}
