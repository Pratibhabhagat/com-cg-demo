package com.cg.demo.encap;

//Inheritance

//Phone class
//FeaturePhone class
//SmartPhone class

public class PhoneDemo {
	
	public static void main(String[] args) {
		
		Phone obj= new Phone();
		obj.call();
		obj.sms();
		
		FeaturePhone obj2 = new FeaturePhone();
		obj2.music();
		obj2.call();
		obj2.sms();
		
		SmartPhone obj3= new SmartPhone();
		obj3.camera();
		obj3.music();
		obj3.call();
		obj3.sms();
		
		SmartPhone obj4= new SmartPhone();
		obj4.music();
		
	}

}
