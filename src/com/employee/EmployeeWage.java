package com.employee;

public class EmployeeWage {	
	public static void main(String[] args) {
		int Is_Full_time = 2;
		int Is_Part_time = 1;
		int Emp_rate_per_hour= 20;
		int emphours=0;
		int empwage=0;
		double empcheck =Math.floor(Math.random()*10)% 3 ;
		if(empcheck==Is_Full_time)
			emphours=8;
		else if(empcheck==Is_Part_time)
			emphours=4;
		else
			emphours=0;
		empwage=emphours*Emp_rate_per_hour;
		System.out.println("Emp Wage :" +empwage);
	}
}
