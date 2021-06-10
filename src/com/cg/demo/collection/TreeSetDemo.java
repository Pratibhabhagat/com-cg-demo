package com.cg.demo.collection;

import java.util.TreeSet;
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		
		ts.add("India");
		ts.add("US");
		ts.add("UK");
		ts.add("India MH");
		System.out.println(ts);//ascending order
		
		ts1.add(56);
		ts1.add(86);
		ts1.add(16);
		System.out.println(ts1);
	}
}
