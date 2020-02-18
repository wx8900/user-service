package com.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jack
 *
 * 创建服务提供者
 * Instances currently registered with Eureka
 * SERVICE-PROVIDER	n/a (2)	(2)	UP (2) - 192.168.11.38:service-provider:8001 , 192.168.11.38:service-provider:8002
 *
 * registered-replicas	http://eureka-7003.com:7003/eureka/, http://eureka-7002.com:7002/eureka/
 * unavailable-replicas	http://eureka-7003.com:7003/eureka/,http://eureka-7002.com:7002/eureka/,
 * available-replicas
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
