package com.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jack
 *
 * 服务1
 * Instances currently registered with Eureka
 * UNKNOWN	n/a (1)	(1)	UP (1) - 192.168.XX.XX
 *
 * registered-replicas	http://eureka-7003.com:7003/eureka/, http://eureka-7002.com:7002/eureka/
 * unavailable-replicas	http://eureka-7003.com:7003/eureka/,http://eureka-7002.com:7002/eureka/,
 * available-replicas
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

}
