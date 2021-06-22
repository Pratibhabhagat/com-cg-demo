package com.cg.demo.exception;
class Test extends Exception{
	
}
public class Test1 {

	public static void main(String[] args) {
		try {
			//throw 10;
			throw new Test();
		}
		catch(Test t) {
			System.out.println("got exception");
		}
		finally {
			System.out.println("cfvgbhnjmk");
		}
	}
}
