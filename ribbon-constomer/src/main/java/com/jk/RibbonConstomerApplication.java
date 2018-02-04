package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient//消费者向服务中心注册的注解
public class RibbonConstomerApplication {

	public static void main(String[] args) {

		SpringApplication.run(RibbonConstomerApplication.class, args);
	}

	@Bean//将RestTemplate注入spring
	@LoadBalanced
//ribbon开启负载均衡，默认轮询
	RestTemplate restTemplate() {

		return new RestTemplate();

	}
}
