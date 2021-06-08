package com.cg.demo.lab1;
//Create a class with a method to find the difference between the sum of the squares and 
//the square of the sum of the first n natural numbers.

import java.util.Scanner;

public class Exercise6Lab1 {
	
	static int calculateDifference(int n) {
		
		int l, k, m;
	    // Sum of the squares of the first n natural numbers is
	    l = (n * (n + 1) * (2 * n + 1)) / 6;
	     
	    // Sum of n natural numbers
	    k = (n * (n + 1)) / 2;
	    
	    // Square of k
	    k = k * k;
	     
	    // Differences between l and k
	    m = k - l;
	     
	    return m;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N natural number ");
		int n = sc.nextInt();
		
		System.out.println(calculateDifference(n));
	}
}
