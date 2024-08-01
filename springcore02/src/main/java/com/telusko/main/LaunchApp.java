package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.config.Beta;
import com.telusko.config.Config;
import com.telusko.controller.WebLayer;

public class LaunchApp {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("applicationconfig.xml");

		WebLayer webBean=container.getBean(WebLayer.class);
		webBean.disp();
		
//		Config configBean=(Config)container.getBean("c");
//		Config configBean=container.getBean("c",Config.class);
//		Config configBean=container.getBean("config");
		Config configBean=container.getBean(Config.class);
		configBean.disp();
		
		Beta betaBean=container.getBean(Beta.class);
		betaBean.disp();
	}

}
