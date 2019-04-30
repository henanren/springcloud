package com.lenovo.ota.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 描述: 指定这个接口所要调用的 提供者服务名称 "iot-ota-server"
 *
 **/
@FeignClient("iot-ota-server")
public interface HomeClient {

	@GetMapping("/")
	String home();

	@GetMapping("/test")
	String test();

	@GetMapping("/test")
	Test test();
}
