package com.cg.demo.oop;

public class BlockDemo {

	public static void main(String[] args) {
		
		BlockDemo obj = new BlockDemo();
		BlockDemo obj1 = new BlockDemo();
		BlockDemo obj2 = new BlockDemo();
	
		System.out.println("something..");
		BlockDemo.m1();
		
 }
	static {
		System.out.println("static Block");
	}
	
	{
		System.out.println("Non static Block");
	}
	
	static {
		System.out.println("another static Block");
	}
	
	{
		System.out.println("Another non static block");
	}
	
	static void m1() {
		System.out.println("m1");
	}
}
