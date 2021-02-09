package com.alibaba.cloud.example.fallback;

import com.alibaba.cloud.example.service.EchoService;

/**
 * Created by Administrator on 2021/2/9 0009.
 */
public class EchoServiceFallback implements EchoService {

    @Override
    public String echo(String str) {
        return "限流降级：" + str;
    }
}
