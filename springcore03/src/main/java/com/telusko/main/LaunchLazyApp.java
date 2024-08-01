package com.telusko.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.telusko.bean.Employee;

public class LaunchLazyApp {

	public static void main(String[] args) {
		
//		Resource resource=new ClassPathResource("applicationconfig.xml");
//		BeanFactory container=new XmlBeanFactory(resource);
		
//		BeanFactory container=new DefaultListableBeanFactory();
		
		DefaultListableBeanFactory container=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(container);
		reader.loadBeanDefinitions("applicationconfig.xml");
		reader.loadBeanDefinitions("applicationconfig2.xml");
		
		Employee eBean1=container.getBean("emp1",Employee.class);
//		String str=eBean1.employeeTask();
//		System.out.println(str);
		System.out.println(eBean1);
		
		System.out.println("*****************************************************");
		
		Employee eBean2=container.getBean("emp2",Employee.class);	
		System.out.println(eBean2);
		
		System.out.println("*****************************************************");
		
		Employee eBean3=container.getBean("emp4",Employee.class);	
		System.out.println(eBean3);

	}

}
