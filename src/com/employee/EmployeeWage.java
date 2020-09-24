package com.employee;

public class EmployeeWage {	
	public static final int Is_Full_Time=2;
	public static final int Is_Part_Time=1;
	
	public static int computeWage(String company,int empRatePerHour,int workingDaysPerMonth,int maxHoursWorking ) {
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
		int Total=TotalHours*empRatePerHour;
		System.out.println("Total Emp Wage :" +Total+" In Total Hours :"+TotalHours);
		return Total;
		}
		public static void main(String[] args) {
		computeWage("DMart",20,20,100);
		computeWage("Reliance",10,22,120);
         
}
}
