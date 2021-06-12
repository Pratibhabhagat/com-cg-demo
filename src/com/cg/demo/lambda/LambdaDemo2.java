package com.cg.demo.lambda;

interface MyInterface{ //interface
	public void M1(int i , int j); //abstract method
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		MyInterface obj = (int i ,int j) -> {
			
			System.out.println( i + j);
		};
		obj.M1(10 , 5);
	}
}
