package com.cloud.microservice2.config;

import feign.InvocationHandlerFactory;
import org.springframework.beans.factory.InitializingBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * created by wyk
 * 2018/8/29
 **/
public class FeignHandler implements InvocationHandler,InitializingBean {

	private Map<Method, InvocationHandlerFactory.MethodHandler>handlers;

	public void setHandlers(Map<Method, InvocationHandlerFactory.MethodHandler> handlers) {
		this.handlers = handlers;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//第2步，进入feignhandler的invoke方法
		System.out.println("before invoke");
		//第3步发送feign请求并返回结果
		Object invoke = handlers.get(method).invoke(args);
		//获取结果
		System.out.println(invoke);
		System.out.println("after invoke");
		return invoke;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("handlers :"+handlers);
	}
}
