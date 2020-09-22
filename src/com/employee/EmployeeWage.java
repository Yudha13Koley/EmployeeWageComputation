package com.employee;

public class EmployeeWage {	
	public static void main (String[] args) {
		int Is_Full_time = 1 ;
		int Emp_rate_per_hour= 20;
		int emphours=0;
		int empwage=0;
		double empcheck =Math.floor(Math.random()*10)%2 ;
		if(empcheck==Is_Full_time)
		{ emphours=8;
		empwage=emphours*Emp_rate_per_hour;
			System.out.println("Emp Wage :" +empwage);
		}
		else {
			System.out.println("Employee is Absent !");
		System.out.println("Emp Wage :" +empwage);
		}

	}
}
