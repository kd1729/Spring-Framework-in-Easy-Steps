package com.kaustubh.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspects {
	
	@Before("execution(* com.kaustubh.spring.springaop.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Before calling the method ! ");
	}
	
	@After("execution(* com.kaustubh.spring.springaop.ProductServiceImpl.multiply(..))")
	public void lofAfter(JoinPoint joinPoint) {
		System.out.println("After method invocation ! ");
	}
}
