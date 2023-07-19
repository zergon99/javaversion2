package com;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteWiseOperation {

	public static void main(String[] args)throws Exception {
		// type : bytewise 
		// source : keyboard 
		// destination : console 
//		DataInputStream dis = new DataInputStream(System.in);
//		PrintStream ps = System.out;
//		ps.println("Enter the name");
//		String name =dis.readLine();
//		ps.println("Name is "+name);
//		
//		DataInputStream dis = new DataInputStream(System.in);
//		//FileOutputStream fos = new FileOutputStream("abc.txt");  // override the value current path
//		//FileOutputStream fos = new FileOutputStream("D:\\abc.txt");// override the value custom path 
//		FileOutputStream fos = new FileOutputStream("abc.txt",true);  // append the value 
//		System.out.println("Plz enter the data");
//		int ch;
//		while( (ch = dis.read()) != '\n') { //enter key
//			System.out.println(ch+"="+(char)ch);
//			fos.write(ch);	// in file automatically convert it
//		}
//		fos.close();
//		System.out.println("Data stored in file");
//		
		
		FileInputStream fis = new FileInputStream("abc.txt");
		FileOutputStream fos = new FileOutputStream("demo.txt");
		int ch;
		while((ch=fis.read()) != -1) {  // EOF is equal to -1 
			fos.write(ch);
		}
		fis.close();
		fos.close();
		System.out.println("file copied...");

	}

}
