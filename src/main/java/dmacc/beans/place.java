package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class place 
{
	private String city;
	private String state;
	
	public place()
	{
		super();
	}
	public place(String state)
	{
		this.state = state;
	}
	public place(String city, String state)
	{
		this.city = city;
		this.state = state;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	@Override
	public String toString() {
		return "place [city=" + city + ", state=" + state + "]";
	}
	
	
}
