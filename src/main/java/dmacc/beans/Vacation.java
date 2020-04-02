package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Vacation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String VacationName;
	private double price;
	@Autowired
	private place Place;
	@Autowired
	private company Company;
	
	public Vacation()
	{
		super();
	}
	public Vacation(String VacationName)
	{
		this.VacationName = VacationName;
	}
	public Vacation(String VacationName, double price)
	{
		this.VacationName = VacationName;
		this.price = price;
	}
	public Vacation(int id, String VacationName, String state, double price)
	{
		this.id = id;
		this.VacationName = VacationName;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVacationName() {
		return VacationName;
	}
	public void setVacationName(String vacationName) {
		VacationName = vacationName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public place getPlace() {
		return Place;
	}
	public void setPlace(place place) {
		Place = place;
	}
	public company getCompany() {
		return Company;
	}
	public void setCompany(company company) {
		Company = company;
	}
	@Override
	public String toString() {
		return "Vacation [id=" + id + ", VacationName=" + VacationName + ", price=" + price + ", Place=" + Place
				+ ", Company=" + Company + "]";
	}
	
	
	
}
