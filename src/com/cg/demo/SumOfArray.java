package com.cg.demo;
import java.util.Scanner; 

public class SumOfArray {

	

			public static void main(String args[]){ 
				
				Scanner sc = new Scanner(System.in);

				System.out.println("Please enter an integer - ");
				int num = sc.nextInt();
				System.out.println(num);
				
				int sum = 0; 
				for (int i = 0; i < 10; i++){ 
					sum = sum + num; 
					//System.out.println("The total sum is: " + sum ); 
				} 
				System.out.println("The total sum is: " + sum ); 
			} 
		
	}


