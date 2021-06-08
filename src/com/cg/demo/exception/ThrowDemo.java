package com.cg.demo.exception;

public class ThrowDemo {

	public static void checkeligibility(int age) {
		System.out.println("Some code..");
		if(age>18) {
			throw new ArithmeticException("Can not vote...");
		}
		else {
			System.out.println("Vote for India");
		}
	}
	

	public static void main(String[] args) {
		System.out.println("Election...");
		checkeligibility(10);
	}
}
