package com.example.demo.service.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Reference(version = "${demo.service.version}")
    private TestService  testService;
    @RequestMapping("/test/{name}")
    public  String  test(@PathVariable(value = "name") String name ){
        return   testService.test(name);
    }


}
