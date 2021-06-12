package com.cg.demo.lambda;

public class FunDemo {

	public static void main(String[] args) {

		FunIn funIn = (int i) -> {
			System.out.println("functionalMethod " + i);
			return false;
		};

		funIn.functionalMethod(10);

	}
}
