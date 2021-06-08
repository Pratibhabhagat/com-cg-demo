package com.cg.demo.oop;
public class MethodDemo {

	
	static void someMethod() {
		System.out.println("Some methods...");
	}
	
	static void addTwoNumber(int num1,int num2) {
		//num1=num1+100;
		System.out.println(num1+num2);
	}
	
	
	public static void main(String[] args) {
		addTwoNumber(5,5);
		
		someMethod();



	}

}
