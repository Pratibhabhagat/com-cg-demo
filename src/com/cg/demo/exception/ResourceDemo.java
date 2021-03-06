package com.cg.demo.exception;

import java.util.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ResourceDemo {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter ");
//		int num = sc.nextInt();
//		System.out.println(num);
		//sc.close();

		// try with resources
		List list;
		ArrayList arrayList;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter ");
			int num = sc.nextInt();
			System.out.println(num);
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}
}
