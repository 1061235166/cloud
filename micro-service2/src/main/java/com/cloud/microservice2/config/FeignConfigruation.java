package com.cloud.microservice2.config;

import feign.Feign;
import feign.InvocationHandlerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * created by wyk
 * 2018/8/29
 **/
@Configuration
public class FeignConfigruation {

	@Bean
	@Scope("prototype")
	public Feign.Builder feignBuilder() {
		Feign.Builder builder = Feign.builder()
				.requestInterceptor(new RestTemplateInterceptor())
				.invocationHandlerFactory(invocationHandlerFactory());
		return builder;
	}

	@Bean
	public InvocationHandlerFactory invocationHandlerFactory() {
		return (target, dispatch) -> {
			FeignHandler handler = new FeignHandler();
			//handler.setTarget(target);
			handler.setHandlers(dispatch);
			return handler;
		};
	}
}
