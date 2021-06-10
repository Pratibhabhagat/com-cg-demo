package com.cg.demo.collection;

import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put(10, "one");
		map.put(90, "Ninty");
		map.put(10, "fifty");
		System.out.println(map); //duplicate is replacrd but not rejected
	}
}
