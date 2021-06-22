package com.cg.demo.conc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExePatDemo implements Runnable {

	public static void main(String[] args) {
		
	//using thread object
//		for (int i = 1; i <= 10; i++) {
//			Thread thread = new Thread(new App());
//			thread.start();
//		}
		ExePatDemo exp = new ExePatDemo();

		// 1. using newSingleThreadExecutor() method
		//ExecutorService exService = Executors.newSingleThreadExecutor();

		//2.using newCachedThreadPool() method
		
//		ExecutorService exService = Executors.newCachedThreadPool();
		
		//3.using newFixedThreadPool() method
//		ExecutorService exService = Executors.newFixedThreadPool(4);
		
		//4. using newScheduleThreadPool() method
		ExecutorService exService = Executors.newScheduledThreadPool(3);
		
		for (int i = 1; i <= 10; i++) {
			exService.execute(exp);
		}
		exService.shutdown();
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + "-" + i);
		}
	}
}
