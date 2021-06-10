package com.cg.demo.collection;

import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<String> obj1 = new LinkedList<>();
		Queue<String> obj2 = new PriorityQueue<>();
		
		Random r = new Random();
		for(int i = 1; i<=5; i++) {
			int j = r.nextInt(10);
			obj1.add("A" + j);
			obj2.add("A" + j);
		}
		System.out.println(obj1);
		System.out.println(obj1.remove());
		System.out.println(obj1.poll());
		
	}
}
