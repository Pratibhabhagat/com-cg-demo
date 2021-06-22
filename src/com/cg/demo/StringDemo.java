package com.cg.demo;

public class StringDemo {

	public static void main(String[] args) {
//		String s1="10";
//		String s2="20";
//		String s3 = s1 + s2;
//		System.out.println(s3);
//

		int[][] arr = new int[3][3];
		arr[0][0] = 85;
		arr[0][1] = 85;
		arr[0][2] = 85;
		arr[1][0] = 85;
		arr[1][1] = 85;
		arr[1][2] = 85;
		arr[2][0] = 85;
		arr[2][1] = 85;
		arr[2][2] = 85;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}

	}
}