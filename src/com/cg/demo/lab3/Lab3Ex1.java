package com.cg.demo.lab3;

//Write a Java program that reads a line of integers and 
//then displays each integer and the sum of all integers. (Use String Tokenizer class)?


import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ente the number seperated by comma: ");
		String input = sc.next();
		
		StringTokenizer st = new StringTokenizer(input,",");
		int sum =0;
		
		while(st.hasMoreTokens()) {
			int n=0;
			n=Integer.parseInt(st.nextToken());
			System.out.println("Number is : "+n);
			sum += n;
			
		}
		System.out.println("Sum of number : "+sum);
	}
}
