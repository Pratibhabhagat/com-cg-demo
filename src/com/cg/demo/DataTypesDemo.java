package com.cg.demo;

/*
 * Data types in java 
 * 
 * Primitives data types - (store single value)
 * byte short int long (integer values) (how many)
 * float double (decimal point values / floating point values) (how much)
 * char (character value / integer value)
 * boolean (true / false)
 * 
 * Reference data types - (store multiple values)
 * array, String, class, interface, enum, ...  
 * 
 */


public class DataTypesDemo {
	public static void main(String[] args) {
		byte b1 = 123;
		System.out.println(b1);
		
		int num = Integer.MAX_VALUE; // 2147483647
        int num2 = Integer.MIN_VALUE; // -2147483648
        System.out.println(num);
        System.out.println(num2);
        
        double d1 = Double.MAX_VALUE;
        double d2 = Double.MAX_VALUE;
        System.out.println(d1);
        System.out.println(d2);
        
        long biggestIntegerJava = Long.MAX_VALUE;
        System.out.println(biggestIntegerJava);
        
        long phone = 7798319078L;
        System.out.println(phone);
		
		String PAN_CARD = "FKGP2700P";
		System.out.println(PAN_CARD);
	}


}




