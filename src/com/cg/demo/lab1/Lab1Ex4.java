package com.cg.demo.lab1;

//Write a Java program that prompts the user for an integer and
//then prints out all the prime numbers up to that Integer?

import java.util.Scanner;

public class Lab1Ex4 {

	public static void primeNum(int num) {
		int flag;
		for (int i = 2; i <= num; i++) {
			flag = 0;
			for (int j = 2; j <= i / 2; j++)
				if ((i % j) == 0) {
					flag = 1;
					break;
				}
			if (flag == 0)
				System.out.print(i + "  ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the integer : ");
		int num = sc.nextInt();
		System.out.println(num);

		Lab1Ex4.primeNum(num);
	}
}
