package com.alibaba.cloud.example.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2021/2/9 0009.
 */
@Component
public class EchoServiceFallbackFactory implements FallbackFactory<EchoServiceFallback> {

    @Override
    public EchoServiceFallback create(Throwable throwable) {
        return new EchoServiceFallback();
    }
}
