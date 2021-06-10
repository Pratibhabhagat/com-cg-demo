package com.cg.demo.collection;

import java.util.List;
import java.util.ArrayList;

class Delete{
	
}

public class GenericDemo {

	public static void main(String[] args) {
		
		List<Integer> markList = new ArrayList<>(); //Type safe collection
		
		
		
		
		Delete delete = new Delete();
		markList.add(10);
		System.out.println(markList.get(0));
		//markList.add(10.5);
	//	markList.add("gbh");
		//markList.add(delete);
	}
}
