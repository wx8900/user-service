package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jack
 *
 *
 * http://localhost:8001/
 * http://localhost:8001/hello2
 * http://localhost:8001/test?param=abc
 * test abc, Port is : 8001
 *
 * 创建服务提供者
 * Instances currently registered with Eureka
 * SERVICE-PROVIDER	n/a (2)	(2)	UP (2) - 192.168.xxx.xxx:service-provider:8001 , 192.168.xxx.xxx:service-provider:8002
 *
Instances currently registered with Eureka
Application	AMIs	Availability Zones	Status
EUREKA-SERVER	n/a (3)	(3)	UP (3) - eureka-7003 , eureka-7001 , eureka-7002
SERVICE-PROVIDER	n/a (3)	(3)	UP (3) - 192.168.xxx.xxx:service-provider:8001 , 192.168.xxx.xxx:service-provider:8002 , 192.168.11.18:service-provider:8003
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class EurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello world";
	}

	@RequestMapping("hello2")
	public String index() {
		return "Hello world from hello12";
	}
}