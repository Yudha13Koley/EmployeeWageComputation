package com.employee;

public class EmployeeWage {	
	public static final int Is_Full_Time=2;
	public static final int Is_Part_Time=1;
	public static final int Emp_rate_per_hour=20;
	public static final int Working_Days_Per_Month=20;
	public static final int Max_Hours_Working=100;
		public static void main(String[] args) {
			int TotalHours=0,TotalDays=0,Total=0;
			while(TotalHours <= Max_Hours_Working && TotalDays<Working_Days_Per_Month) {
				int emphrs=0,empwage=0;
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
			Total=TotalHours*Emp_rate_per_hour;
			System.out.println("Total Emp Wage :" +Total+" In Total Hours :"+TotalHours);
			}
}
