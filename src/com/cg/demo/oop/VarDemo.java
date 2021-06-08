package com.cg.demo.oop;

class Abc{
	int num5;
	static int num6;
}

public class VarDemo {

	
	int num;
	static int num2;
	
	void m1() {
		int num3;
	}
	public static void main(String[] args) {
		int num4=10;
		System.out.println(num4);
		System.out.println(num2);
		
		System.out.println(Abc.num6);
		
		Abc abc=new Abc();
		System.out.println(abc.num5);

	}

}
