package com.example.productdetailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductdetailserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductdetailserviceApplication.class, args);
	}

}
