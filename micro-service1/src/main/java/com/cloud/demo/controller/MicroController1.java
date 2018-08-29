package com.cloud.demo.controller;

import com.cloud.demo.service.MicroService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by wyk
 * 2018/8/29
 **/
@RestController
public class MicroController1 {

	@Autowired
	private MicroService1 microService1;

	@GetMapping("/getName")
	public String getName(@RequestParam("name")String name){
		return microService1.getName(name);
	}
}
