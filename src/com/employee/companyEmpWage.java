package com.employee;

public class companyEmpWage {
	public final String company;
	public final int empRatePerHour;
	public final int workingDaysPerMonth;
	public final int maxHoursWorking;
	public int TotalWage;
	
	public companyEmpWage(String company,int empRatePerHour,int workingDaysPerMonth,int maxHoursWorking) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.workingDaysPerMonth=workingDaysPerMonth;
		this.maxHoursWorking=maxHoursWorking;
	}

	public void setTotalWage(int total) {
		TotalWage = total;
	}
	@Override
	public String toString() {	
		return "Total Employee wage for company " +company+ " is : " +TotalWage;
	
}
}
