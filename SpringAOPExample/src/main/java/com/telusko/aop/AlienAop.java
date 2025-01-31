package com.telusko.aop;

import java.time.LocalTime;
import java.util.NoSuchElementException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AlienAop {

	//@Before(value = "execution(* com.telusko.rest.*.*(..))")
	@Before(value = "execution(* com.telusko.rest.AlienController.*(..))")
	public void beforeAdvice(JoinPoint joinpoint) {
		System.out.println("Request made to "+joinpoint.getSignature()+ " at "+LocalTime.now());
	}
	
	@After(value = "execution(* com.telusko.rest.AlienController.*(..))")
	public void afterAdvice(JoinPoint joinpoint) {
		System.out.println("Request came from "+joinpoint.getSignature()+ " at "+LocalTime.now());
	}
	
	@Before(value = "execution(* com.telusko.service.AlienServiceImpl.*(..))")
	public void beforeAdviceService(JoinPoint joinpoint) {
		System.out.println("Request made to "+joinpoint.getSignature()+ " at "+LocalTime.now());
	}
	
	@After(value = "execution(* com.telusko.service.AlienServiceImpl.*(..))")
	public void afterAdviceService(JoinPoint joinpoint) {
		System.out.println("Request came from "+joinpoint.getSignature()+ " at "+LocalTime.now());
	}
	
	@AfterThrowing(value = "execution(* com.telusko.service.AlienServiceImpl.*(..))",throwing = "exception")
	public void afterAdviceServiceThrow(JoinPoint joinpoint,NoSuchElementException exception){
		
		System.out.println("Request came from "+joinpoint.getSignature()+ " at "+LocalTime.now()
		+" exception is : "+exception.getMessage());
		
		
	}
}
