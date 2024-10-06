package org.baseframe.controller;

import org.baseframe.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * API-测试接口
 *
 * Create by zhangzhixiong on 2024-04-20
 */

@RestController
@RequestMapping("/test")
public class TestController {

    private final HelloService helloService;

    public TestController(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("/hello")
    public String hello() {
        return helloService.getHello();
    }
}
