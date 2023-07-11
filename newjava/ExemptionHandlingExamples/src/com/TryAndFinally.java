package com;

public class TryAndFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int a=10;
		int b=0;
		try {
			int res  = a/b;
			System.out.println("Result is "+res);
			System.out.println("No Exception");
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("Finish");
	}

}
