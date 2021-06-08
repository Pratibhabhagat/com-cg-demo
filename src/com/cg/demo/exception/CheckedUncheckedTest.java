package com.cg.demo.exception;

public class CheckedUncheckedTest {

	public static void main(String[] args) {
		System.out.println("Start");

		System.out.println(0 / 0); // ArithmeticException - unchecked exception 

//		Thread.sleep(1000); // InterruptedException - checked exception 

		System.out.println("End");
	}
	}

