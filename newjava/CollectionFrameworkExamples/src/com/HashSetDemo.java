package com;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		System.out.println("Size "+hs.size());
		System.out.println("Empty or not: "+hs.isEmpty());
		hs.add(10); 
		hs.add(10);
		hs.add(10.20);
		hs.add("Lex");
		hs.add(true);
		hs.add("Panathinaikos");
		System.out.println("Size "+hs.size());
		System.out.println("Empty or not: "+hs.isEmpty());
		System.out.println(hs);
		hs.remove("Lex"); // it remove using value 
		System.out.println(hs);
		System.out.println("Search "+hs.contains(10));
		System.out.println("Search "+hs.contains("Panathinaikos"));
		System.out.println(hs);
		hs.clear();    // remove all elements 
		System.out.println(hs);
		System.out.println("size "+hs.size());

	}

}
