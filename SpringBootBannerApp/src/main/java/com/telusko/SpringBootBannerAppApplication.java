package com.telusko;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBannerAppApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(SpringBootBannerAppApplication.class, args);
		
//		SpringApplication app = new SpringApplication(SpringBootBannerAppApplication.class);
//        app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);
 
	}

}
