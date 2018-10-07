package com.laomn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laomn.client.HomeClient;

/**
 * 描述:调用提供者的 `home` 方法
 *
 **/
@RestController
public class ConsumerController {

	@Autowired
	private HomeClient homeClient;

	@GetMapping(value = "/hello")
	public String hello() {
		return homeClient.consumer();
	}

	@GetMapping(value = "/hello2")
	public String hello2() {
		return homeClient.consumer2();
	}
}
