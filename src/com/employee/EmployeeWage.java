package com.employee;

public class EmployeeWage {	
	public static final int Is_Full_Time=2;
	public static final int Is_Part_Time=1;

	private final String company;
	private final int empRatePerHour;
	private final int workingDaysPerMonth;
	private final int maxHoursWorking;
	private int Total;
	
	public EmployeeWage(String company,int empRatePerHour,int workingDaysPerMonth,int maxHoursWorking) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.workingDaysPerMonth=workingDaysPerMonth;
		this.maxHoursWorking=maxHoursWorking;
	}
	
	public void computeWage() {
		int TotalHours=0,TotalDays=0;
		while(TotalHours <= maxHoursWorking && TotalDays<workingDaysPerMonth) {
			int emphrs=0;
			TotalDays++;
		double empcheck =Math.floor(Math.random()*10)% 3;
		switch((int)empcheck) {
		case Is_Part_Time :emphrs=4;
		break;
		case Is_Full_Time :emphrs=8;
		break;
		default: emphrs=0;
		}
		TotalHours+=emphrs;
		System.out.println("Emp Hours :" +emphrs+" In Day :"+TotalDays);
		}
		Total=TotalHours*empRatePerHour;
		}
	@Override
	public String toString() {	
		return "Total Employee wage for company " +company+ " is : " +Total;
	}
		public static void main(String[] args) {
		EmployeeWage DMart=new EmployeeWage("DMart",20,20,100);
		EmployeeWage Reliance=new EmployeeWage("Reliance",15,22,100);
		DMart.computeWage();
		System.out.println(DMart);
		Reliance.computeWage();
		System.out.println(Reliance);
         
}
}
