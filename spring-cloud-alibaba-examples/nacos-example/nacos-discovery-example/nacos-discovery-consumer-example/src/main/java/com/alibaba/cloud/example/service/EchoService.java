package com.alibaba.cloud.example.service;

import com.alibaba.cloud.example.fallback.EchoServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Administrator on 2021/2/6 0006.
 */
@FeignClient(name = "${service.provider.name}", fallbackFactory = EchoServiceFallbackFactory.class)
public interface EchoService {

    @GetMapping("/echo/{str}")
    String echo(@PathVariable("str") String str);

    @GetMapping("/echo/provinces")
    String provinces();
}
