package com.interceptorspring.springinterceptor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.interceptorspring.springinterceptor.interceptor.DemoInterceptor;

@Configuration
public class DemoConfiguration implements WebMvcConfigurer {
	
	
	
	@Autowired
	private DemoInterceptor demoInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(demoInterceptor);
	}
	
	
	
	

}
