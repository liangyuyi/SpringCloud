package com.liangyuyi;

/**
 * 服务注册中心：@EnableEurekaServer ,eureka页面：http://localhost:8000
 * 配置服务器：@EnableConfigServer注解开启配置服务器的功能
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
@EnableConfigServer
public class CloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServerApplication.class, args);
	}

}
