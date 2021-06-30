package com.cg.democode;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	String name;
	int salary;
	//​​​​​
    public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();
	}
//​​​​​
}
class test {

	public static void main(String[] args) {
		
	
    enum SortMethod implements Comparator<Employee> {
        NAME(Comparator.comparing(Employee::getName)), SALARY(Comparator.comparingInt(Employee::getSalary));

        private final Comparator<Employee> comparator;

 

        SortMethod(Comparator<Employee> comparator) {
            this.comparator = comparator;
        }

 

        @Override
        public int compare(Employee o1, Employee o2) {
            return comparator.compare(o1, o2);
        }
    };
	}
    
 

    public List<Employee> sort(List<Employee> emps, final SortMethod method) {
        return emps.stream().sorted(method).collect(Collectors.toList());
    }
   
}

