package com;

public class DefaultThreadInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t =Thread.currentThread();
		System.out.println(t);
		t.setName("My one");
		t.setPriority(10);
		System.out.println(t);
		

	}

}
