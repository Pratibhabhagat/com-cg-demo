package com.cg.demo.ios;

import java.io.*;

public class DataIODemo {

	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("sample.txt"));
		
		DataInputStream dis = new DataInputStream(new FileInputStream("sample.txt"));
		
		dos.writeInt(2165);
		int i = dis.readInt();
		System.out.println(i);
		dos.close();
		dis.close();
	}
}
