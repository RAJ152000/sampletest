package com.interceptorspring.springinterceptor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.interceptorspring.springinterceptor.entity.DemoUser;



@Repository
@EnableJpaRepositories
public interface InterRepository extends JpaRepository<DemoUser, Integer>
{

}
