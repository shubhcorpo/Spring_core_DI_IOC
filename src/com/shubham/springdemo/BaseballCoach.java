package com.shubham.springdemo;

public class BaseballCoach implements Coach{

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService thefortuneservice) {
		fortuneService=thefortuneservice;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "good to spend 30 mins in baseballcourt bro!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

/*	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	} */
}
