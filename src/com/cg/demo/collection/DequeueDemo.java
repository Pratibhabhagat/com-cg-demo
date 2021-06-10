package com.cg.demo.collection;

import java.util.*;

public class DequeueDemo {

	public static void main(String[] args) {
		Deque<String> obj1 = new LinkedList<>();
		Deque<String> obj2 = new ArrayDeque<>();
		
		obj1.add("Java");
		obj1.add("Oracle");
		obj1.add("JavaScript");
		obj1.add("HTML");
		
		System.out.println(obj1);
		System.out.println(obj1.removeLast());
		System.out.println(obj1.element());
		System.out.println(obj1.pollLast());
		System.out.println(obj1.peek());
		System.out.println(obj1);
		
		
		obj2.add("Java");
		obj2.add("Oracle");
		obj2.add("JavaScript");
		obj2.add("HTML");
		
		System.out.println(obj2);
		System.out.println(obj2.removeLast());
		System.out.println(obj2.element());
		System.out.println(obj2.pollLast());
		System.out.println(obj2.peek());
		System.out.println(obj2);
	}
}
