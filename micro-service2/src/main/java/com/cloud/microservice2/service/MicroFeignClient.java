package com.cloud.microservice2.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * created by wyk
 * 2018/8/29
 **/
@FeignClient(value = "micro-service1")
public interface MicroFeignClient {

	@GetMapping(value = "/getName")
	String getName(@RequestParam("name")String name);
}
