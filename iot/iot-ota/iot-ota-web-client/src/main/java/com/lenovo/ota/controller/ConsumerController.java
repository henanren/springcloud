package com.lenovo.ota.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lenovo.ota.client.HomeClient;

/**
 * 描述:调用提供者的 `home` 方法
 *
 **/
@RestController
public class ConsumerController {

	@Autowired
	private HomeClient homeClient;

	@GetMapping(value = "/home")
	public String home() {
		return homeClient.home();
	}

	@GetMapping(value = "/test")
	public String test() {
		return homeClient.test();
	}
}
