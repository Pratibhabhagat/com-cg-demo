package com.cg.demo.miscelleneous;

import com.cg.demo.abs.Employee;

public class GarbageDemo {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		emp2 = null;//unused object destroyed automatically
		emp3 = emp1;

	}
}
