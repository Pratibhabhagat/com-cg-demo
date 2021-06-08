package com.cg.demo.lab5;

import java.util.Scanner;

class NameNotValidException extends Exception
{
     public String validname(String n)
     {
          return ("Name is not Valid..Please ReEnter the Name");
     }
}
public class Lab5Ex2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
//		System.out.println("Enter your First name : ");
//		String name = sc.next();
//		
//		System.out.println("Enter your Last name : ");
//		String name2 = sc.next();
		//temp =0;
		//int n;
		 try
         { 
			 System.out.println("Enter your First name : ");
				String name = sc.next();
				
				System.out.println("Enter your Last name : ");
				String name2 = sc.next();
			 
              if(name == " " && name2 ==" ")
                   throw new NameNotValidException();
              else
                  System.out.println("First name is ");
         }
         catch(NameNotValidException e2){
         
              System.out.println(e2);
         }

		 System.out.println("sdfghnfghbn");
		
}
	
}