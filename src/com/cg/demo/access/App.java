package com.cg.demo.access;

import com.cg.demo.method.DemoClass;

//import com.cg.demo.pc2.DemoClass;
//import com.cg.demo.method.Employee;

import com.cg.demo.method.*;

public class App {

	public static void main(String[] args) {
		
			DemoClass obj=new DemoClass();
			System.out.println(obj.publicField);
//			System.out.println(obj.protectedField);
//			System.out.println(obj.packageField);
			
			
			//Employee obj1 = new Employee();
			
			//FQN-fully Quallified Name
			com.cg.demo.method.Employee emp= new com.cg.demo.method.Employee();
			com.cg.demo.pc2.Employee emp2= new com.cg.demo.pc2.Employee();
			
			
		}
	}


