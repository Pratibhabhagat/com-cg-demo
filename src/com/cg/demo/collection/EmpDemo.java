package com.cg.demo.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class EmpDemo {

public static void main(String[] args) {
		
		Employee emp = new Employee();
		Delete del = new Delete();
		
//		List<Employee> empList = new ArrayList<Employee>();
		
		List<Employee> empList = new LinkedList<Employee>();
		
	//	List<Delete> delList = new ArrayList<Delete>();
		
		empList.add(emp);
		empList.add(new Employee());
		empList.add(new Employee(103, "Afgbhnj", 10.5));
		
	//	delList.add(del);//CE
	//	empList.add(40); //CE
		
		System.out.println(empList);

		System.out.println("Iterate using for loop");

		for (int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i).toString());
		}

		System.out.println("Iterate using for each loop");

		for (Employee e : empList) {
			System.out.println(e.toString());
		}

		System.out.println("Iterate using Iterator");

		Iterator<Employee> iterator = empList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}


}
}
