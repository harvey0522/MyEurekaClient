package com.me;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.me"})
public class MyEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEurekaClientApplication.class, args);
	}

}
