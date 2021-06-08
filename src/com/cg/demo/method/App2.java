package com.cg.demo.method;
//App2-Product
public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product obj = new Product();
		obj.prId=456;
		obj.prName="product1";
		obj.prColor="blue";
		obj.prCost=5565.5;
		System.out.println(obj.toString());
	
	
		Product obj1 = new Product();
		obj1.prId=456;
		obj1.prName="product1";
		obj1.prCost=5565.5;
		System.out.println(obj1.toString());
	
	
		Product obj2 = new Product();
		obj2.prId=456;
		obj2.prName="product1";
		obj2.prCost=5565.5;
		System.out.println(obj2.toString());
		
		Product obj3 = new Product(104,"asd","red",25.4);
        System.out.println(obj3.toString());
        
        Product obj4= new Product(123,"jggf");
        System.out.println(obj4.toString());
        
	}
	

}
