package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("c")
public class Config {
	
	public Config() {
		System.out.println("Config Bean Created");
	}
	
	public void  disp() {
		System.out.println("Logic in Config");
	}

	@Bean
	public Beta betaInstance() {
		return new Beta();
	}
	@Bean
	public Password generatePassword() {
		Password p=new Password("SHA!");
		return p;
	}
}
