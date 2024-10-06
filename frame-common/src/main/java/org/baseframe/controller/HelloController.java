package org.baseframe.controller;

import org.baseframe.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 *
 * Create by zhangzhixiong on 2024-04-13
 */
@RequestMapping("/Hello")
@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/getHello")
    public String getHello() {
        return helloService.getHello();
    }
}
