package com.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.raghab.dao.ProductDao;
@Configuration
public class Utils {
 
	public Utils() {
		System.out.println("Utils::Consturctor");
	}

	@Bean
	ProductDao getProduct() {
		System.out.println("getUtils method called by IOC for @Bean annotation");
		return new ProductDao();
	}
}
