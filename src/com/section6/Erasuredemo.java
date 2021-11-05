package com.section6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Erasuredemo {

	public static void main(String[] args) {
		System.out.println(method(5));
		
		ArrayList l1 = new ArrayList<String>();
		l1.add(12);
		l1.add(true);
		l1.add(12.6);
		System.out.println(l1);
	}
	
	public static String method(Integer x) {
		List<String> a = new LinkedList<>();
		a.add("Python");
		List b = a;
		
//		return b.get(0);
		return a.get(0);		
	}
	
	public static void method2(ArrayList<String> l) {
		
	}
	
	// not possible to override generic
//	public static void method2(ArrayList<Integer> l) {
//		
//	}
}