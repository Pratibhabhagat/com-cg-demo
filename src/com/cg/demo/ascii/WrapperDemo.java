package com.cg.demo.ascii;

public class WrapperDemo {

	public static void main(String[] args) {
		

//		String name="patu";
//		int num =12;
	
		Integer num2=12;//wrapper class
		System.out.println(num2.toString());
	
//		System.out.println(Integer.MAX_VALUE);
		
		WrapperDemo obj = new WrapperDemo();
		WrapperDemo obj2 = new WrapperDemo();
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println(obj==obj2);
	}

}
