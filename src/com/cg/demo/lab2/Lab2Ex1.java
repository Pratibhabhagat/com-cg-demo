package com.cg.demo.lab2;


//Create a method which accepts an array of integer elements and 
//return the second smallest element in the array

import java.util.Scanner;

public class Lab2Ex1 {

	 static void getSecondSmallest(int[] arr , int n) {
		
		int temp=0;
	       
      for (int i = 0; i <arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
                if(arr[i] >arr[j]) {      
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
      
      System.out.println("Second Smallest number is "+arr[1]);
  	}
	 
	 public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = Sc.nextInt();
		
		int[] arr1 = new int[size];
		
		for(int i=0 ; i < arr1.length ; i++) {
			System.out.println("Please Enter elements in the array ");
			arr1[i] = Sc.nextInt();
		}
		
		getSecondSmallest(arr1 , size);
	}
	}

	
