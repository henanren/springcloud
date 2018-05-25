package com.laomn.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaProviderApplication {

	@Value("${server.port}")
	String port;

	@RequestMapping("/")
	public String Hello() {
		String str = "Hello world ,port:" + port;
		System.out.println(str);
		return str;
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApplication.class, args);
	}

}
