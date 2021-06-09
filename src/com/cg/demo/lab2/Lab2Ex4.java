package com.cg.demo.lab2;

import java.util.Scanner;

public class Lab2Ex4 {

	static void modifyArray(int[] arr,int n) {
		
		
		 int [] temp = new int[n];
		 int j =0;
		 for(int i = 0 ; i < n-1 ; i++) {
			 if(arr[i] != arr[i+1]) {
				 temp[j++] =arr[i];
				 
			 }
		 }
		 temp[j++] = arr[n-1];
		 
		 for(int k = 0 ; k < temp.length ; k++) {
			 System.out.print(" " + temp[k]);
		 } 
	}
		 static void sortArr(int[] arr , int n) {
				int temp;
				for(int i = 0 ; i < n ; i++) {
					for(int j= i+1 ; j< n ; j++) {
						if(arr[i] > arr[j]) {
							temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}
				 System.out.println("Array sorted in ascending order: ");  
			        
			        for(int i=0;i<arr.length;i++) { //Length is property of array
						System.out.println(arr[i]);
					}
			        
			}
	
	
	
	
	
	
public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = Sc.nextInt();
		
		int[] arr1 = new int[size];
		
		for(int i=0 ; i < arr1.length ; i++) {
			System.out.println("Please Enter elements in the array: ");
			arr1[i] = Sc.nextInt();
		}
		System.out.println("Duplicate removes array: ");
		Lab2Ex4.modifyArray(arr1,size);
		Lab2Ex4.sortArr(arr1,size);
}
}