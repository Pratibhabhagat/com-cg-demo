package com.cg.demo.abs;

//Polymorphism
//Polymorphism - methods with the same name having different functionalities 

//compile time polymorphism - method overloading - early binding 
//possible with both static and non static methods 
//with static methods, possible only in one class 
//with non static methods, possible one class, or super + sub classes  //App class in same package
//three types 
//1. different number of arguments 
//2. different types of arguments 
//3. different order of arguments 

//run time polymorphism - method overriding - late binding 
//possible only with non static methods //--ss in pictures
//possible only in super + sub classes 
//complete method signature is same 


//possible with both static and non static methods 
//with static methods, possible only in one class

public class PlyDemo {

	static int add(int i, int j) {
		return i + j;
	}
	
	static int add(int i, int j,int k) {
		return i + j + k;
	}
	
//	int add(int i, int j,int k,int l) {
//		return i + j + k + l;
//	}
//	
//	int add(int i, byte j) {
//		return i + j;
//	}
//	
//	int add(byte i, int j) {
//		return i + j;
//	}
	
	public static void main(String[] args) {
		
//		PlyDemo obj= new PlyDemo();
//		System.out.println(obj.add(5, 6));  //non static method invoked by object
//		System.out.println(obj.add(5, 6 ,3));
//		System.out.println(obj.add(5, 6 , 4, 3));
//		byte arg1=10;
//		int arg2=20;
//		System.out.println(obj.add(arg1,arg2));
//		System.out.println(obj.add(arg2,arg1));
//		
//		System.out.println(obj.m1());
		
		System.out.println(add(5 ,6)); //static method should  be invoked by directly
		System.out.println(add(8, 6, 4));
	}
}
