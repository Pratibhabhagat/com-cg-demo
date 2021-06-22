package com.cg.demo.multithread;

public class ThreadDemo extends Thread {

	public void printLoop() {
		for(int i=1 ; i<=10 ; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	@Override
	public void run() {
		this.printLoop();
	}
	
	public static void main(String[] args) throws InterruptedException {

		ThreadDemo obj = new ThreadDemo();
		ThreadDemo obj2 = new ThreadDemo();
		ThreadDemo obj3 = new ThreadDemo();
		obj.start();
		obj.join();
		
		System.out.println(obj.getName());
		obj.setName("MyThread1");
		System.out.println(obj.getName());
		System.out.println(obj2.getName());
		System.out.println(obj3.getName());
		obj.getPriority();
		//obj2.start();
		//obj3.start();
//		obj.printLoop();
//		obj2.printLoop();
//		obj3.printLoop();
	}
}
	
	

