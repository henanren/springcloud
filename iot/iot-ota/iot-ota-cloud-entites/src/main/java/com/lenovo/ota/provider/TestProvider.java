package com.lenovo.ota.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lenovo.ota.entites.Test;
import com.lenovo.ota.entites.Test2;
import com.lenovo.ota.service.TestService;

@RestController
public class TestProvider {

	@Value("${server.port}")
	String port;

	@Autowired
	private TestService testService;

	@RequestMapping("/")
	public String home() {
		return "Hello world ,port:" + port;
	}

	@RequestMapping("/test")
	public String test() {
		return "Hello test world ,port:" + port;
	}

	@RequestMapping("/one")
	public Test oneTest() {
		return testService.findOne();
	}

	@RequestMapping("/one2")
	public Test2 oneTest2() {
		return testService.findOneTest2();
	}

}
