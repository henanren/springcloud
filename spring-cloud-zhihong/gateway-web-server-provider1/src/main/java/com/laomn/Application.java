package com.laomn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

import com.laomn.eureka.provider.EurekaProviderApplication;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApplication.class, args);
	}
}
