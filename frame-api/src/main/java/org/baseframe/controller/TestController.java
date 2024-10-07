package org.baseframe.controller;

import org.baseframe.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * API-测试接口
 *
 * Create by zhangzhixiong on 2024-04-20
 */

@RestController
@RequestMapping("/jenkins")
public class TestController {

    private final HelloService helloService;

    public TestController(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("/hello")
    public String hello() {
        return helloService.getHello();
    }

    /**
     * 测试Jenkins CI/CD
     *
     * @return {@link String}
     */
    @GetMapping("/helloJenkins")
    public String helloJenkins() {
        return "hello jenkins";
    }
}
