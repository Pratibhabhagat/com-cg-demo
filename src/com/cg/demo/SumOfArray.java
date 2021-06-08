package com.cg.demo;
import java.util.Scanner; 

public class SumOfArray {

	

			public static void main(String args[]){ 
				Scanner input = new Scanner(System.in); 
				int sum = 0; 
				for (int i = 0; i < 10; i++){ 
					sum = sum + input.nextInt(); 
				} 
				System.out.println("The total sum is: " + sum ); 
			} 
		
	}


