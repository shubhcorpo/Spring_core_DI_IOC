package com.shubham.springdemo;

public class TrackCoach implements Coach {

	
	
private FortuneService fortuneService;
	
public TrackCoach() {
	}
	public TrackCoach(FortuneService thefortuneservice) {
		fortuneService=thefortuneservice;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "You are on Track and run a hard 10 KM !!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "That is insane!!You are champion!"+fortuneService.getFortune();
	}

}
