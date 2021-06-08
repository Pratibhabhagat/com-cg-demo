package com.cg.demo.oop;

//Create a method which accepts an integer array, 
//reverse the numbers in the array and returns the resulting array in sorted order

public class ReverseArray {
	
		  
	    /* function that reverses array and stores it 
	       in another array*/
	    static void reverse(int a[], int n)
	    {
	        int[] b = new int[n];
	        int j = n;
	        for (int i = 0; i < n; i++) {	
	            b[j - 1] = a[i];
	            j = j - 1;
	        }
	  
	        /*printing the reversed array*/
	        System.out.println("Reversed array is: ");
	        for (int k = 0; k < n; k++) {
	            System.out.println(b[k]);
	        }
	    }
	  
	    public static void main(String[] args)
	    {
	        int [] arr = {100, 20, 340, 140, 50};
	        reverse(arr, arr.length);
	        
	        int temp=0;
	    
	    
	    for (int i = 0; i <arr.length; i++) {     
	          for (int j = i+1; j < arr.length; j++) {     
	              if(arr[i] >arr[j]) {      //swap elements if not in order
	                 temp = arr[i];    
	                 arr[i] = arr[j];    
	                 arr[j] = temp;    
	               }     
	            }     
	        }  
	    System.out.println("\nArray sorted in ascending order: ");    
        for (int i = 0; i <arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
	    
	    }
}


