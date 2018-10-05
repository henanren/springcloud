package com.laomn.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 描述: 指定这个接口所要调用的 提供者服务名称 "eureka-provider"
 *
 **/
@FeignClient("eureka-provider")
public interface HomeClient {

	@GetMapping("/")
	String consumer();

	@GetMapping("/2")
	String consumer2();
}
