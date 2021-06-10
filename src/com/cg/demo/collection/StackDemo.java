package com.cg.demo.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(45);
		s1.push(65);
		s1.push(95);
		System.out.println(s1.size());
		System.out.println(s1.capacity());
		System.out.println("stack element" + s1);
		System.out.println("Top element of stack is " + s1.peek());
		System.out.println("Remove the element from stack is " + s1.pop());
		System.out.println("Stack element after removal " + s1);
		
		System.out.println("check 65 elemet in stack " + s1.search(65));
		
	}
}
	