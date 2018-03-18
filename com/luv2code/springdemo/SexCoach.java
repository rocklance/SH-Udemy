package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("mySexCoach")
public class SexCoach implements Coach{

	public String getDailyWorkout()
	{
		return "Let us have some sex!";
	}
	public String getDailyFortune()
	{
		return null;
	}
}
