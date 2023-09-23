package com.vis.boot.income;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class IncomeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncomeAppApplication.class, args);
	}

}
