package com.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import in.raghab.dao.ProductDao;

@Configuration
public class SecurityConfig {
	private ProductDao product;
	
	public SecurityConfig(ProductDao product) {
		super();
		System.out.println("Security::Constructor");
		this.product=product;
	}
	
}
