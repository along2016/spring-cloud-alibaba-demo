package com.alibaba.cloud.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
