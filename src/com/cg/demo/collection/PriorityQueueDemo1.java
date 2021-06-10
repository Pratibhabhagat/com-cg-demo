package com.cg.demo.collection;

import java.util.*;
public class PriorityQueueDemo1 {

	public static void main(String[] args) {
		PriorityQueue<String> obj = new PriorityQueue<>();
		
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("D");
		
		System.out.println(obj.peek());
		System.out.println(obj);
		obj.poll();
		obj.remove("C");
		System.out.println(obj);
	}
}
