package com.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * @author chensong
 * 消费者启动类
 */
@SpringBootApplication
@EnableFeignClients
public class CloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsumerApplication.class, args);
	}
}
