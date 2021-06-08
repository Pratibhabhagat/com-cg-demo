package com.cg.demo.exception;

import java.util.Scanner;
import java.util.InputMismatchException;

//robust - Exception Handling, Garbage collection
public class App {

	

//		System.out.println("start");
//		try {
//			
//		}
//		int a = 10, b = 0, c = a / b; //stop
//		
//		System.out.println(c);
//		
//		System.out.println("end");
		
		public static int divide() {
			
		Scanner sc=new Scanner(System.in);
		
		try {
		System.out.println("Enter1");
		int num=sc.nextInt();
		
		System.out.println("Enter2");
		int num2=sc.nextInt();
		return num/num2;
		
		}
		catch(ArithmeticException ae){
			System.out.println("Do not divide by zero");
			return 0;
		}
		catch (InputMismatchException ime) {
			System.out.println("Please enter only integer.");
			return 0;
		} catch (Exception e) {
			System.out.println("Something is wrong.");
			return 0;
		} finally {
			System.out.println("finally...");
			sc.close();
		}
	}
		public static void main(String[] args) {
			System.out.println("Start");
			System.out.println(App.divide());
			System.out.println("End");
		}
}
