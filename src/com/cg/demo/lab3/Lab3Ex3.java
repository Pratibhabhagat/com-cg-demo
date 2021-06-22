package com.cg.demo.lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
//import java.util.Scanner;

//Create a method which accepts a String and
//replaces all the consonants in the String with the next alphabet. 

public class Lab3Ex3 {

	public static String alterString() throws IOException  {
		
		Reader str = null;
		BufferedReader bf = new BufferedReader(str);
		//System.out.print("Enter any string = ");
		String inputString = bf.readLine().toLowerCase();

		for(int i=0; i < inputString.length(); i++){
		    char inputChar = inputString.charAt(i);

		    String consonants = "BCDFGHJKLMNPQRSTVWXYZ".toLowerCase();
		    for(int j = 0; j < consonants.length(); j++){
		        char stringChar = consonants.charAt(j);

		        if(inputChar == stringChar){
		        }  

		    }
		}
		return inputString;
	}
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the string : ");
//		Object sc;
//		String str = sc.next();
//		System.out.println(str);
//		
//		Lab3Ex3.alterString(str);
		String str;
		System.out.println("Start");
		
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(isr);
		//str=br.readLine();
		
		//System.out.println(str);
		Lab3Ex3.alterString();

	}
}
