package com.cg.demo.lambda;


import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class FunInterfaceType {

	public static void main(String[] args) {
		
		Function<Integer ,Integer> obj1 = num1 -> num1 * num1; //Function - apply() -accept argument & produce result
		System.out.println(obj1.apply(10));
		
		
		Predicate<Integer> obj2 = num -> { //Predicate - test() - accept argument return true/false
			if(num % 2 == 0)
				return true;
			return false;
		};
		System.out.println(obj2.test(22));
		
		
		Consumer<String> obj3 = name  ->   //Consumer - accept() -accept argument bt doesnt return any value
			System.out.println(name);
			obj3.accept("Patu");
			
			
		Supplier<String> obj4 = () -> "Patu"; //Supplier - get() - does not take argument but return value
		System.out.println(obj4.get());
		
	}
}
