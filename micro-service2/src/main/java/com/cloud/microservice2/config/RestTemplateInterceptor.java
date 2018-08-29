package com.cloud.microservice2.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * created by wyk
 * 2018/8/29
 **/
public class RestTemplateInterceptor implements RequestInterceptor{

	@Override
	public void apply(RequestTemplate template) {
		System.out.println("进入RestTemplateInterceptor");
	}
}
