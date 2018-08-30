package com.cloud.demo.service;

import com.cloud.Annotation;
import org.springframework.stereotype.Service;

/**
 * created by wyk
 * 2018/8/29
 **/
@Service
public class MicroService1 {

	@Annotation(annoName = "asd")
	public String getName(String name){
		return "hello your name is:"+name;
	}
}
