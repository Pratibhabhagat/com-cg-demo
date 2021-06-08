package com.cg.demo.method;
//app-Employee
public class App {

    public static void main(String[] args) {

        int num = 10;
//scanner.........
        Employee obj = new Employee();
        obj.id = 101; //sc.nextint()
        obj.name = "Abc";
        obj.salary = 10.5;
        System.out.println(obj.toString());

        Employee obj1 = new Employee();
        obj.id = 101;
        obj.name = "Abc";
        obj.salary = 10.5;
        System.out.println(obj1.toString());
        
        Employee obj2 = new Employee();
        obj.id = 101;
        obj.name = "Abc";
        obj.salary = 10.5;
        System.out.println(obj2.toString());
        
        Employee obj4 = new Employee(104,"asd",25.4);
        System.out.println(obj4.toString());
        
        Employee obj6= new Employee(123,"jggf");
        System.out.println(obj6.toString());
        

    }

 

}