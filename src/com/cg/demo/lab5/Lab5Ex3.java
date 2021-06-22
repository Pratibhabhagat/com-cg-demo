package com.cg.demo.lab5;

import java.util.Scanner;

//Create an Exception class named as “EmployeeException”(User defined Exception) in a package
//named as “com.cg.eis.exception” and throw an exception if salary of an employee is below than 3000.
//Use Exception Handling mechanism to handle exception properly.

class EmployeeException extends Exception{
	

	public EmployeeException(String str) {
		  System.out.println(str);
		 }
}

public class Lab5Ex3 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the salary of Employee : ");
		double salary = sc.nextDouble();
		
		try {
			if(salary < 3000) 
				throw new EmployeeException(salary + " salary Not Done...");
			
			else 
				System.out.println(salary + "  salary Done...");
			
			}
		catch(EmployeeException e){
			System.out.println(e);
		}
		finally{
			sc.close();
		}
	}
}
