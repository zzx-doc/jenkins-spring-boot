package org.baseframe.service.impl;

import org.baseframe.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * 测试服务
 *
 * Create by zhangzhixiong on 2024-04-13
 */
@Service
public class HelloServiceImpl implements HelloService {
    public String getHello() {
        return "hello";
    }
}
