package com.section6;

import java.util.ArrayList;

public class Bahaviour {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("Basics");
		l.add("String");
		method(l);
		System.out.println(l);
	}

	public static void method(ArrayList a) {
		a.add(10);
		a.add("Monthy");
		a.add(true);
	}
}