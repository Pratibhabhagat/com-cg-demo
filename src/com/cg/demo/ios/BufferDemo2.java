package com.cg.demo.ios;

import java.io.*;

public class BufferDemo2 {

	public static void main(String[] args) throws IOException{
		
		FileWriter fw = new FileWriter("sample2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String str ="Sample text";
		
		bw.write(str);
		System.out.println("Text written to file");
		bw.close();
		
	}
}
