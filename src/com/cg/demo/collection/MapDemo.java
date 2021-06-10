package com.cg.demo.collection;

import java.util.Map;
import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
			Map<Integer,String> mp = new HashMap<>();
			
			mp.put(10, "India");
			mp.put(50, "England");
			mp.put(90, "USA");
			mp.put(10, "China");
			mp.put(70, "China");
			
			System.out.println(mp);
			System.out.println(mp.get(90));
			
			Map<String, String> states = new HashMap<>();

			states.put("TS", "Telangana");
			states.put("MH", "Maharashtra");
			states.put("KA", "Karnataka");
			System.out.println(states);
	}
}
