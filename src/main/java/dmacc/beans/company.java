package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class company 
{
	private String companyName;
	private String vacationAgent;
	
	public company()
	{
		super();
	}
	public company(String companyName)
	{
		this.companyName = companyName;
	}
	public company(String companyName, String vacationAgent)
	{
		this.companyName = companyName;
		this.vacationAgent = vacationAgent;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getVacationAgent() {
		return vacationAgent;
	}
	public void setVacationAgent(String vacationAgent) {
		this.vacationAgent = vacationAgent;
	}
	@Override
	public String toString() {
		return "company [companyName=" + companyName + ", vacationAgent=" + vacationAgent + "]";
	}
	
}
