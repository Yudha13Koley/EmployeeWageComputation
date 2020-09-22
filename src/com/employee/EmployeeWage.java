package com.employee;

public class EmployeeWage {	
	public static final int Is_Full_Time=2;
	public static final int Is_Part_Time=1;
	public static final int Emp_rate_per_hour=20;
	public static final int Working_Days_Per_Month=20;
		public static void main(String[] args) {
			int emphrs=0,empwage=0,Total=0;
			for(int i=0;i < Working_Days_Per_Month;i++) {
			double empcheck =Math.floor(Math.random()*10)% 3;
			switch((int)empcheck) {
			case Is_Part_Time :emphrs=4;
			break;
			case Is_Full_Time :emphrs=8;
			break;
			default: emphrs=0;
			}
			empwage=emphrs*Emp_rate_per_hour;
			Total+=empwage;
			System.out.println("Emp Wage :" +empwage);
			}
			System.out.println("Total Emp Wage :" +Total);
			}
}
