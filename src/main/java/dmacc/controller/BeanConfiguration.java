package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Vacation;

@Configuration
public class BeanConfiguration 
{
	@Bean
	public Vacation vacation()
	{
		Vacation bean = new Vacation("Beach side");
		//bean.setVacationName("Mountain climb");
		//bean.setState("CO");
		//bean.setPrice(544.99);
		return bean;
	}
}
