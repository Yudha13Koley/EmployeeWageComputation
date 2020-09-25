package com.employee;

public interface EmpWageInterface {
	public void addCompanyEmpWage(String company,int empRatePerHour,int workingDaysPerMonth,int maxHoursWorking);
	 public void computeWage();
	 public int computeWage(companyEmpWage companyEmpWage);
}
