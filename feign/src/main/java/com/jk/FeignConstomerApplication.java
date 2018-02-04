package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient//消费者向服务中心注册的注解
@EnableFeignClients//声明是Feign类型的消费者。
public class FeignConstomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignConstomerApplication.class, args);
	}
}
