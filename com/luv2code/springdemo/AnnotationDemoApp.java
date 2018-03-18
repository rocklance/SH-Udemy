package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring cofig file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean
		Coach theCoach=context.getBean("thatSillyCoach", Coach.class);
		//call some methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		//close the context
		
		context.close();
	}

}
