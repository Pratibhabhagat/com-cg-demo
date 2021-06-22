package com.cg.demo.lab3;

import java.util.Scanner;

//: Create a class containing a method to create the mirror image of a String.
//The method should return the two Strings separated with a pipe(|) symbol .

public class Lab3Ex2 {

	public static StringBuffer getImage(String str) {

		StringBuffer result = new StringBuffer(str);

		System.out.println("The mirror image : " + result + "|" + result.reverse());

		return result.reverse();
	}

	public static void main(String[] args) {

		// String str = "abcd";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String : ");
		String str = sc.next();
		System.out.println("Input : " + str);

		Lab3Ex2.getImage(str);

	}
}
