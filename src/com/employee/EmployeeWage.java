package com.employee;

public class EmployeeWage {	
	public static void main (String[] args) {
		int Is_Full_time = 0 ;
		double empcheck =Math.floor(Math.random()*10)%2 ;
		if(empcheck==Is_Full_time)
			System.out.println("Employee is Present !");
		else
			System.out.println("Employee is Absent !");

}

}
