package com.cg.demo.multithread;

public class Test {

	public static void main(String[] args) {
		
		Thread t =  Thread.currentThread();
		
		System.out.println(t.getPriority());
		//System.out.println(t);
	}
}
