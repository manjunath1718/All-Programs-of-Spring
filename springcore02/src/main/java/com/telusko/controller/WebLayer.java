package com.telusko.controller;

import org.springframework.stereotype.Controller;

@Controller
public class WebLayer {
	
	public WebLayer() {
		System.out.println("WebLayer Bean Created");
	}
	public void disp() {
		System.out.println("Logic in WebLayer");
	}

}
