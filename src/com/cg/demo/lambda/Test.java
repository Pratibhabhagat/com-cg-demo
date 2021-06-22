package com.cg.demo.lambda;

interface MyInterface1{
	public void m2(int i);
}

public class Test {

	public static void main(String[] args) {
		MyInterface1 obj = (int i) -> {
			System.out.println("Lambda Expression " + i);
		};
		obj.m2(54);
	}
}
