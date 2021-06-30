package com.cg.demo.lambda;

//interface MyInterface1{
//	public void m2(int i);
//}
//
//public class Test {
//
//	public static void main(String[] args) {
//		MyInterface1 obj = (int i) -> {
//			System.out.println("Lambda Expression " + i);
//		};
//		obj.m2(54);
//	}
//}

//public class Test {
//
//	private String name="Unknown";
//	private double price = 0.0;
//	
//	public Test() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public Test(String name, double price) {
//		super();
//		this.name = name;
//		this.price = price;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {

		Comparator<String> comp = (s1, s2) -> Integer.compare(
				s1.length(), s2.length());
		
		
		String[] values = {"****","***","*","**","*****"};
		Collections.sort(Arrays.asList(values),comp);
		for(String value:values) {
			System.out.println(value);
		}
		

	}

}















//	@Override
//	public String toString() {
//		return "Item [name=" + name + ", price=" + price + "]";
//	}
//}