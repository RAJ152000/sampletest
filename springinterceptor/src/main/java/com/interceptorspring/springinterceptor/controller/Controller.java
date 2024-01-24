package com.interceptorspring.springinterceptor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interceptorspring.springinterceptor.Service.InterService;
import com.interceptorspring.springinterceptor.entity.DemoUser;

@RequestMapping("/user")
@RestController
public class Controller {
	
	
	@Autowired
	private InterService interService;
	
	@GetMapping("/sample")
	public String ping() {
		return "ACCESS INTERCEPTOR";
	}
	
	@GetMapping("/all")
	public Iterable<DemoUser> fetchAll() {
		return interService.fetchAllRecords();
	}

}
