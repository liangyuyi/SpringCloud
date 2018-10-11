package com.liangyuyi.controller;

import com.liangyuyi.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangyuyi
 * @date 2018/10/8
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String hi(String name){
        return helloService.hiService(name);
    }
}
