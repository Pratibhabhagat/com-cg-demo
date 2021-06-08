package com.cg.demo;
//if else ,switch ,loop

public class IfElseDemo {

	public static void main(String[] args) {
		int marks = 98;
		
		if (marks <= 100 && marks >= 91) {
			System.out.println("A grade");
		} else if (marks <= 90 && marks >= 81) {
			System.out.println("B grade");
		} else if (marks <= 80 && marks >= 71) {
			System.out.println("C grade");
		} else if (marks <= 70 && marks >= 61) {
			System.out.println("D grade");
		} else if (marks <= 60 && marks >= 51) {
			System.out.println("E grade");
		} else {
			System.out.println("F grade");
		}
		

	}

}
