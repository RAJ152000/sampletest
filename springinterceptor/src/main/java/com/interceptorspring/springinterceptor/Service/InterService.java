package com.interceptorspring.springinterceptor.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interceptorspring.springinterceptor.Repository.InterRepository;
import com.interceptorspring.springinterceptor.entity.DemoUser;

@Service
public class InterService {
	
	@Autowired
	private InterRepository interRepository;

	public Iterable<DemoUser> fetchAllRecords() {
	
		return interRepository.findAll();
	}
	
	

}
