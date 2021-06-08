package com.cg.demo.lab1;

//
//public class Practice {
//	public static void main(String[] args) {
//		
//		int num = 20;
//		int num1 = 10;
//		int num2 = num + num1 ;
//		
//		System.out.println("Addition of two number "+ num2);
//	}
//
//}



//import java.util.Scanner;
//
//public class Practice {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of num is ");
//		int num = sc.nextInt();
//		System.out.println(num);
//	}
//}

//import java.util.Scanner;
//
//public class Practice{
//	
//	
//	public static void main(String[] args) {
//		int a[] = new int[5];
//		a[0]=10;
//		a[1]=20;
//		Scanner sc = new Scanner();
//	
//	for(int i=0; i<=a.length; i++) {
//		System.out.println("Enter the values ");
//		int a[] = sc.nextInt();
//		System.out.println(a[i]);
//	}
//	
//}
//}









import java.util.Scanner;

 

public class Practice{
    
    private static boolean checknumber(int n) {
        // TODO Auto-generated method stub
         while(n % 2==0) {//number even or not
                n=n/2;//4,2,1
                    }
            if(n==1) {
                return true;
            }
            else {
                return false;
            }
    }
    
    private static void checkpower(int n) {
        // TODO Auto-generated method stub
        if(checknumber(n)) {
            System.out.println("number is power of two");
            int count = 0;
            while(n % 2==0) {//number even or not
                n=n/2;
                count++;
                    }
        System.out.println("power is ="+count);
        }
        else {
            System.out.println("number is not power of two");
        }
            
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number");
        int n  = sc.nextInt();
        checknumber(n);
        checkpower(n);
    

    


    }
    
}
 
​​​





​
























