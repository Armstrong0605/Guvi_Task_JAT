package com.example.hrtest;

import com.example.hr.Employee;   // importing the package

public class EmployeeTest {
	
	public static void main (String args[])
	{
		
	Employee obj = new Employee ();
	// to display output
	 System.out.println("Employee Details:");
	 System.out.println("Name: " + obj.getName());
     System.out.println("ID: " + obj.getId());
     System.out.println("Salary: " + obj.getsalary());
}
}