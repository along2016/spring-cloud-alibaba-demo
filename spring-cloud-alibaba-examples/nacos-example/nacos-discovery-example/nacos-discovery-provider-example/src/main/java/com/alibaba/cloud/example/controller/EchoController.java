package com.alibaba.cloud.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2021/2/6 0006.
 */

@RestController
public class EchoController {

    @RequestMapping("/")
    public ResponseEntity index(){
        return new ResponseEntity("index error", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/echo/{str}")
    public String echo(@PathVariable String str) {
        return "hello Nacos Discovery " + str;
    }

    @GetMapping("/echo/provinces")
    public String provinces() {
        List<String> provinceList = new ArrayList<>();
        provinceList.add("安徽");
        provinceList.add("江苏");
        provinceList.add("湖南");
        provinceList.add("湖北");
        provinceList.add("江西");
        provinceList.add("山东");
        provinceList.add("河南");
        return "中国的几个主要省份有：" + provinceList.stream().collect(Collectors.joining(","));
    }
}
