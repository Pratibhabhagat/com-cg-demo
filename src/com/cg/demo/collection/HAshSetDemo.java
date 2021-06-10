package com.cg.demo.collection;

import java.util.*;
public class HAshSetDemo {

	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
		HashSet obj2 = new HashSet();
		
		Random r = new Random();
		
		for(int i= 1;i<= 10;i++) {
			int num = r.nextInt(5);
			obj1.add(num);
			obj2.add(num);
		}
		
		System.out.println("List" + obj1); //allow duplicate
		System.out.println("set : " + obj2); //doesnot allow duplicate
		
//		Set<Integer> mySet = new HashSet<>();
//		
//		mySet.add(50);
//		mySet.add(40);
//		mySet.add(30);
//		mySet.add(50);
//		
//		System.out.println(mySet);
	}
}
