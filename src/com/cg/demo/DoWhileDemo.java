package com.cg.demo;

public class DoWhileDemo {

	public static void main(String[] args) {
		System.out.println("Start");

		int num = 1;

//		while(num<=6) {
//			System.out.println(num);
//			
//		}num++;
		
		do {
			System.out.println(num);
			num++;
		} while (num <= 9);

		System.out.println("end");
	}

}