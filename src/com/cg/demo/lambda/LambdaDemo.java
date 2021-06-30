package com.cg.demo.lambda;

public class LambdaDemo {

	// 1. by implementing the interface  
	
	//public class LambdaDemo implements MyInt {
//		public static void main(String[] args) {
//			LambdaDemo obj = new LambdaDemo();
//			obj.absMethod();
//		}
//		@Override
//		public void absMethod() {
//			System.out.println("absMethod");
//		}
	//}

	// 2. by anonymous inner class 
	
//		public static void main(String[] args) {
//			MyInt obj = new MyInt() { //create object of interface
//				@Override
//				public void absMethod() {
//					System.out.println("absMethod");
//				}
//			};
//			obj.absMethod();
//		}
	

	
	// 3. by lambda expression () -> {}  

//	public static void main(String[] args) {
//		
//		MyInt obj = (int i) -> {
//			System.out.println("Lambda Method " + i);
//		};
//		obj.absMethod(10);
//	}
//	

public static void main(String[] args) {
	MyInt obj = (int i) -> {
		System.out.println("lambda : " + i);
	};
	obj.absMethod(50);
}

}













