package com.employee;

public class EmployeeWage implements EmpWageInterface {	
	public static final int Is_Full_Time=2;
	public static final int Is_Part_Time=1;
	private int numberOfCompanies=0;
	private companyEmpWage[] companyEmpWageArray;
	
	public EmployeeWage() {
		companyEmpWageArray=new companyEmpWage[5];
	}
	public void addCompanyEmpWage(String company,int empRatePerHour,int workingDaysPerMonth,int maxHoursWorking) {
		companyEmpWageArray[numberOfCompanies]=new companyEmpWage(company,empRatePerHour,workingDaysPerMonth,maxHoursWorking);
		numberOfCompanies++;
	}
	    public void computeWage() {
		for(int i=0;i<numberOfCompanies;i++)
		{
			companyEmpWageArray[i].setTotalWage(this.computeWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	    }
		public int computeWage(companyEmpWage companyEmpWage)
		{
		int TotalHours=0,TotalDays=0;
		while(TotalHours <= companyEmpWage.maxHoursWorking && TotalDays<companyEmpWage.workingDaysPerMonth) {
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
		return TotalHours*companyEmpWage.empRatePerHour;
		}
		public static void main(String[] args) {
			EmployeeWage empWageBuilder=new EmployeeWage();
		empWageBuilder.addCompanyEmpWage("DMart",20,20,100);
		empWageBuilder.addCompanyEmpWage("Reliance",15,22,100);
	    empWageBuilder.computeWage();
         
}
}
