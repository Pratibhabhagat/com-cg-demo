package com.cg.demo.lab5;

import java.util.Scanner;

class NameNotValidException extends Exception
{
     public String validname(String n)
     {
          return ("Name is not Valid..Please ReEnter the Name");
     }
}

public class Pracct {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
	System.out.println("Enter your First name : ");
		String name1 = null;
		
		System.out.println("Enter your Last name : ");
		String name2 = null;
		//temp =0;
		//int n;
		
		  if((name1==null && name2==null)||( name1.isEmpty()&& name2.isEmpty()))
		  {
			  try
            
            		  {
                          throw new NameNotValidException();
            		  }
         catch(Exception e2){
         
              System.out.println(e2);
         }
		  }
		 else
		 {
			System.out.println(name1);
			System.out.println(name2);
		
		 }

	}
	
}