package com.cloud.microservice2.controller;

import com.cloud.Annotation;
import com.cloud.microservice2.service.MicroFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by wyk
 * 2018/8/29
 **/
@RestController
public class MicroController2 {

	@Autowired
	private MicroFeignClient microFeignClient;

	@GetMapping("/getName")
	@Annotation(annoName = "asd")
	public String getName(@RequestParam("name")String name){
		//1第一步，调用feign客户端发送请求
		String result="microservice2,"+ microFeignClient.getName(name);
		//第四步，结束feign的调用返回
		return result;
	}
}
