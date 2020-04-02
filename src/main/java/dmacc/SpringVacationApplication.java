package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Vacation;
import dmacc.beans.company;
import dmacc.beans.place;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.VacationRepository;

@SpringBootApplication
public class SpringVacationApplication //implements CommandLineRunner 
{

	public static void main(String[] args) {
		SpringApplication.run(SpringVacationApplication.class, args);
	}
	
	/*
	@Autowired
	VacationRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vacation v = new Vacation("Mountain Climb", 349.99);
		place p = new place("Colorado Springs", "CO");
		company c = new company("EZ travel", "Amanda Browning");
		v.setPlace(p);
		v.setCompany(c);
		repo.save(v);
		
		List<Vacation> allVacations = repo.findAll();
		for(Vacation trip: allVacations)
		{
			System.out.println(trip.toString());
		}
	}
	*/
	

}
