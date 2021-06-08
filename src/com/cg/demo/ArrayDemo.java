package com.cg.demo;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the size of array: ");

	int size = sc.nextInt();

	int[] arr = new int[size];

	System.out.println(arr.length);

	for (int i = 0; i < arr.length; i++) {
		System.out.println("Please enter elements:");
		arr[i] = sc.nextInt();
	}

	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}

}

//	public static void main(String[] args) {
//		int a[]= new int[5];
//		
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
//		
//		for(int i=0;i<a.length;i++) { //Length is property of array
//			System.out.println(a[i]);
//		}
//
//	}

}
