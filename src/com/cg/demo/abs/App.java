package com.cg.demo.abs;

//with non static methods, super + sub classes  - method overloading Plymorphisms

class XYZ{   //non static method
	int add(int i, int j) {
		return i + j;
	}
}

class PQR extends XYZ{
	int add(int i, int j,int k) {
		return i + j + k;
	}
	
}

public class App {

	public static void main(String[] args) {
		PQR obj= new PQR();
		System.out.println(obj.add(10, 10));
		System.out.println(obj.add(20, 10, 10));
		

	}

}
