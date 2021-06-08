package com.cg.demo.encap;

class SmartPhone extends FeaturePhone{  //multilevel inheritance
	
	void camera() {
		System.out.println("snap pics...");
	}
	@Override
	void music() {  //Override method - runtime method
		System.out.println("Playing Dolby music");
	}
}