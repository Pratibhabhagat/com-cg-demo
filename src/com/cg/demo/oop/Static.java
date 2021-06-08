package com.cg.demo.oop;

public class Static {

	static int ifsc=545644;    //static field- free access 
	
	int accNo;       //non static field- restricted access
	String name;
	double balance;
	
	static void openAccount() {
		System.out.println("Open an account");
	}
	
	void checkBalance() {  //non static context
		System.out.println(balance);
	}
	
	public static void main(String[] args) {
		
		Static st = new Static();
		st.accNo=45648;
		st.name="Patu";
		st.balance=215.55;
		
		System.out.println(st.accNo +" "+st.name+" "+st.balance);
		System.out.println(ifsc);
		
		st.checkBalance();     //call the method using object because this is non static method
		openAccount();         //direct call to static method
		

	}

}
