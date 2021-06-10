package com.cg.demo.collection;


import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		
		//ArrayList
		
//		ArrayList myList = new ArrayList(); //un type safe
//		System.out.println(myList.size());
//		myList.add(10);
//		myList.add(10.54);
//		myList.add("dfgh");
//		
//		System.out.println(myList.size());
//		System.out.println(myList);
		
		//LnkedList
		LinkedList lList = new LinkedList();
		lList.add(40);
		lList.add("dgh");
		lList.add(40.45);
		//lList.remove(40);
		
		System.out.println(lList.size());
		System.out.println(lList);
		lList.remove("dgh");
		System.out.println(lList);
		
		
		
	}
}
