package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vacation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String VacationName;
	private String state;
	private double price;
	
	public Vacation()
	{
		super();
		this.state="IA";
	}
	public Vacation(String VacationName)
	{
		this.VacationName = VacationName;
	}
	public Vacation(String VacationName, String state, double price)
	{
		this.VacationName = VacationName;
		this.state = state;
		this.price = price;
	}
	public Vacation(int id, String VacationName, String state, double price)
	{
		this.id = id;
		this.VacationName = VacationName;
		this.state = state;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vacation [id=" + id + ", VacationName=" + VacationName + ", state=" + state + ", price=" + price + "]";
	}
	
}
