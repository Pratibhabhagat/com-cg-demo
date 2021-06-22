package com.cg.demo.encap;

//Encapsulation - Binding data and code together
//make field as private
//and create public getter and setter
public class Demo {

	private int num;
	private double balance;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
