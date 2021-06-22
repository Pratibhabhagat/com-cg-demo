package com.cg.demo.oop;
//static-Free access-booking window
//not static-Restricted access-cinema hall
class Employee{
	
	//fields-attributes
	int id;
	String name;
	double salary;
	
	//Method
	void work(){
		System.out.println("Employee Works....");
	}
}


public class App {

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.id=2334;
		obj.name="asdff";
		obj.salary=5244.5522;
		
		System.out.println(obj.id + " " + obj.name + " " + obj.salary);
		
		obj.work();

	}

}
