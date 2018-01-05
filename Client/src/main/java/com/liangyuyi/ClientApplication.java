package com.liangyuyi;

/**
 * 客户端
 * eurekaclient: @EnableEurekaClient 表明自己是一个eurekaclient.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}


    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hi")
    public String home(@RequestParam(value = "name", required = false) String name){
        return "hi " + name + ", the port is: " + port;
    }
}
