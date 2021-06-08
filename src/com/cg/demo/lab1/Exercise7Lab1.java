package com.cg.demo.lab1;

//Create a method to check if a number is an increasing number

import java.util.Scanner;

public class Exercise7Lab1 {

	static boolean  checkNumber(int num) {
		 boolean increasing = false;
	        while(num>0) {
	            int lastDigit = num % 10;
	            num /= 10;
	            int nextLastDigit = num % 10;
	            
	            if(nextLastDigit<=lastDigit) {
	                increasing=true;
	            }
	            else {
	                increasing=false;
	                break;
	            }
	            
	        }
	        return increasing;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int n= sc.nextInt();
		
		if (checkNumber(n))
            System.out.println(n + " is an increasing number");
        else
            System.out.println(n + " isnot  increasing number");
		
		
	}
}
