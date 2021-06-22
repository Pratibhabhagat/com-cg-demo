package com.cg.demo.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo2 {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(101,"patu",15000));
		empList.add(new Employee(101,"patu",15000));
		empList.add(new Employee(101,"patu",15000));
		empList.add(new Employee(101,"patu",15000));
		empList.add(new Employee(101,"patu",15000));
		
		System.out.println(empList);
		
		//Iterator<Employee> ite = empList.iterator();
		//while(ite.remove()) {
//			ite.next().id =;
//		}
//		System.out.println(empList);
//	}}
	}
}
