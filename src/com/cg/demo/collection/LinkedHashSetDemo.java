package com.cg.demo.collection;

import java.util.*;
//import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("patu");
		lhs.add("sonu");
		lhs.add("tanu");
		lhs.add("sonu");
		
		System.out.println(lhs);
		
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();
		
		lhs1.add(10);
		lhs1.add(90);
		lhs1.add(80);
		lhs1.add(10);
		
		System.out.println(lhs1);
	
	}
}
