package com.laomn.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.laomn.zuul.filter.AccessPasswordFilter;
import com.laomn.zuul.filter.AccessTokenFilter;
import com.laomn.zuul.filter.AccessUserNameFilter;

@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	@Bean
	public AccessUserNameFilter accessUserNameFilter() {
		return new AccessUserNameFilter();
	}

	@Bean
	public AccessPasswordFilter accessPasswordFilter() {
		return new AccessPasswordFilter();
	}

	@Bean
	public AccessTokenFilter accessTokenFilter() {
		return new AccessTokenFilter();
	}

}
