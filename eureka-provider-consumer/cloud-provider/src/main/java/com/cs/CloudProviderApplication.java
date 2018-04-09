package com.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author chensong
 * 服务提供者启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudProviderApplication.class, args);
	}
}
