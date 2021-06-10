package com.cg.demo.collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector(3 , 2);
		
//		System.out.println(v.size());
//		System.out.println(v.capacity());
//		
//		for(int i=10; i<=100; i +=10) {
//			v.add(new Integer(i));
//		}
//		System.out.println(v.size());
//		System.out.println(v.capacity());
//		
//		v.add(110);
//		System.out.println(v.size());
//		System.out.println(v.capacity());
//		
		
		
		System.out.println(v.capacity());
		v.add(30);
		v.add(40);
		v.add(60);
		v.add(80);
		
		System.out.println(v.capacity());
		
	}
}
