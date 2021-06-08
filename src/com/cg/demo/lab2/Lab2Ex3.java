package com.cg.demo.lab2;

////Create a method which accepts an integer array, 
//reverse the numbers in the array and returns the resulting array in sorted order

import java.util.Scanner;

public class Lab2Ex3 {
	static void getSorted(int[] arr,int n) {
		
		int[] b = new int[n]; //reverse the array
        int j = n;
        for (int i = 0; i < n; i++) {	
            b[j - 1] = arr[i];
            j = j - 1;
        }
  
        /*printing the reversed array*/
        System.out.println("Reversed array is: ");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
		
        //sorting array
        int temp=0;
        for (int i = 0; i <arr.length; i++) {     
              for (int k = i+1; k < arr.length; k++) {     
                  if(arr[i] >arr[k]) {      
                     temp = arr[i];    
                     arr[i] = arr[k];    
                     arr[k] = temp;    
                   }     
                }     
            }
        System.out.println("Sorted Array: ");  //print sorted array
        
        for(int i=0;i<arr.length;i++) { //Length is property of array
			System.out.println(arr[i]);
		}
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
	getSorted(arr1,size);
}
}
