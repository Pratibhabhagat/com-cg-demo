package com.cg.demo.lab1;

//Create a method to find the sum of the cubes of the digits of an n digit number

import java.util.Scanner;

public class Lab1Ex1 {

	public static void sumOfCubes(int num) {
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum += i * i * i;

		}
		System.out.println("The sum of the cubes of number " + num + " is : " + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		System.out.println(num);

		Lab1Ex1.sumOfCubes(num);
	}
}
