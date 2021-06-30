package com.cg.democode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Emplo> employeeList = new ArrayList<>();
       
        employeeList.add(new Emplo("mickey", 100000));
        employeeList.add(new Emplo("tinny", 50000));
        employeeList.add(new Emplo("anny", 4000));
        employeeList.sort(new NameComparator());
        System.out.println("by name:");
        
        employeeList.forEach(System.out::println);
        employeeList.sort(new SalaryComparator());
        System.out.println("by salary:");
        employeeList.forEach(System.out::println);
    }
}

class Emplo{
	    String name;
	    int salary;

	    Emplo(String name, int salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "name='" + name + '\'' +
	                ", salary=" + salary +
	                '}';
	    }
	}

class NameComparator implements Comparator<Emplo> {
    @Override
    public int compare(Emplo o1, Emplo o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SalaryComparator implements Comparator<Emplo> {
    @Override
    public int compare(Emplo o1, Emplo o2) {
        return Integer.compare(o1.salary, o2.salary);
    }
}