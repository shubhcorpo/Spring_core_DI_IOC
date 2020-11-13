package com.shubham.springdemo;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach thecoach=(Coach)context.getBean("myCoach");
		
		System.out.println(thecoach.getDailyWorkout());
		//((AbstractApplicationContext) context).close();
		//context.close();
		
		System.out.println(thecoach.getDailyFortune());
	}

}
