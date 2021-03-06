package com.spring.zk.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.spring.zk.servie.HelloService;

@Service(
        version = "${hello.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello "+name+" !";
    }
}
