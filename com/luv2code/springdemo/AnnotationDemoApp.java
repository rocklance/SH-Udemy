package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring cofig file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean
		Coach theCoach=context.getBean("tennisCoach", Coach.class);
		
		Coach sexCoach=context.getBean("mySexCoach", Coach.class);
		//call some methods on the bean here
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get dailyFortune
		System.out.println(theCoach.getDailyFortune());
		//System.out.println(sexCoach.getDailyWorkout());
		//close the context here
		context.close();
	}

}
