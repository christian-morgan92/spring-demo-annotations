package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("SwimmingCoach")
public class SwimmingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Swim 15 laps";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
