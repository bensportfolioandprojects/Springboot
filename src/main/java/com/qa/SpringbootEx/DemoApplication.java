package com.qa.SpringbootEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//This is the runner
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
//		Object byName = context.getBean("hello");
////		String byType = context.getBean(String.class);
//		String byBoth = context.getBean("hello", String.class);
//		
//		System.out.println(byName);
////		System.out.println(byType);
//		System.out.println(byBoth);
	}
	

}
