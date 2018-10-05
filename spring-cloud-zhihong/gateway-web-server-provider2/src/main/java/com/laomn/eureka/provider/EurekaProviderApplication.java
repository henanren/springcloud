package com.laomn.eureka.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaProviderApplication {

	@Value("${server.port}")
	String port;

	@RequestMapping("/")
	public String Hello() {
		return "Hello world ,port:" + port;
	}

	@RequestMapping("/2")
	public String Hello2() {
		return "Hello 2 world ,port:" + port;
	}

}
