package com.cg.demo;

public class OperatorDemo {

	public static void main(String[] args) {

		int i = 10, j = 3, k;

		k = i + j;
		System.out.println(k);

		k = i - j;
		System.out.println(k);

		k = i * j;
		System.out.println(k);

		k = i / j;
		System.out.println(k); // 3

		k = i % j;
		System.out.println(k);

		int numberOfStudents = 10;
		int batches = 3;
		int studentsInEachBatch = numberOfStudents / batches;

		int remainingStudents = numberOfStudents % batches;

		System.out.println("studentsInEachBatch " + studentsInEachBatch);
		System.out.println("remainingStudents " + remainingStudents);

	}

}
