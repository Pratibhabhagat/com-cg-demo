package com.cg.demo.lab5;

// Write a Java Program to validate the full name of an employee.
//Create and throw a user defined exception if firstName and lastName is blank.

class InvalidName extends Exception{ //user defined exception

	public InvalidName(String firstName,String lastName) {
		System.out.println("Name not valid");
	}
}
public class Lab5Ex2{
	
	public boolean checkName(String firstName,String lastName) throws InvalidName {
		if(firstName.isBlank() || lastName.isBlank()) {
			throw new InvalidName(firstName,lastName);
			
			//return false;
		}
		return true;
	}
	public static void main(String[] args) throws InvalidName {
		
		String firstName = "Patu";
		String lastName = "Bhagat";
		
		Lab5Ex2 obj = new Lab5Ex2();
		System.out.println(obj.checkName(firstName,lastName));
		
		
		
	}
}