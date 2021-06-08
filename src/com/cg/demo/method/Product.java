package com.cg.demo.method;

public class Product {
	//four field
	int prId;
	String prName;
	String prColor;
	double prCost;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Product(int prId, String prName) {
		super();
		this.prId = prId;
		this.prName = prName;
	}



	public Product(int prId, String prName, String prColor, double prCost) {
		super();
		this.prId = prId;
		this.prName = prName;
		this.prColor = prColor;
		this.prCost = prCost;
	}



	@Override
	public String toString() {
		return "Product [prId=" + prId + ", prName=" + prName + ", prColor=" + prColor + ", prCost=" + prCost + "]";
	}
	
	
	
	
//	Product(){
//		System.out.println("default Constructor");
//	}
//
//	Product(int prId,String prName){
//		 this.prId=prId;
//		 this.prName=prName;
//		 System.out.println(" prId=" + prId + "prName= " + prName );
//	 }
//
//	 Product(int prId,String prColor,String prName,double prCost){
//		 this.prId=prId;
//		 this.prName=prName;
//		 this.prColor=prColor;
//		 this.prCost=prCost;
//		 
//		 System.out.println("Four Parameterize constructor");
//	 }
//
//	@Override
//	public String toString() {
//		return "Product [prId=" + prId + ", prName=" + prName + ", prColor=" + prColor + ", prCost=" + prCost + "]";
//	}
//
//	
//	 

}
