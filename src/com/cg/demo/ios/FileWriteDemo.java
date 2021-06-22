package com.cg.demo.ios;

import java.io.*;

public class FileWriteDemo {

	public static void main(String[] args) {
		try {
			File f1 = new File("FileDemo.txt");
			String str = "This is my file demo";
			
			FileWriter fw = new FileWriter(f1);
			fw.write(str);
			fw.close();
			System.out.println("done");
		}catch (IOException e) {
			System.out.println("Not Done");
		}
	}
}
