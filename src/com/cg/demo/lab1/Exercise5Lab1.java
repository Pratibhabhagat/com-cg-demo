	package com.cg.demo.lab1;
	//Sum of number which is divisible by 3 or 5
	
	import java.util.Scanner;
	
	public class Exercise5Lab1 {
	
			static int calculateSum (int n,int x,int y) {
			int s1,s2,sum;
			
			s1 = ((n / x)) * (2 * x + (n / x - 1) * x) / 2;//Sn=n\2 *(2a +(n-1)*d) //n=n/x //N/3
	        s2 = ((n / y)) * (2 * y + (n / y - 1) * y) / 2;//n/5
	        sum = ((n / (x * y))) * (2 * (x * y)+ (n / (x * y) - 1) * (x * y))/ 2; //reapeated value subtract
	        
	        //n=15
	        //n/3=3,6,9,12,15
	        //n/5=5,10,15
	        //3*5=15
	        ////Sn=n\2 *(2a +(n-1)*d) = 
	        
	        		
	        
	        
	        return s1 + s2 - sum;
			
		}
		
		public static void main(String[] args) {
			int x;
			int y;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the N natural number ");
			int n = sc.nextInt();
			
			System.out.println("The sum of " + n + "number which are divisible by 3 or 5 is " + calculateSum(n, 3, 5));
			
		}
	}
