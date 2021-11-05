package com.section3;

import java.util.ArrayList;
import java.util.List;

public class Subtyping {
	public static void main(String[] args) {
		Object o = new Object();
		Integer i = Integer.valueOf(11);
		
		o = i;
		
		List<Number> l = new ArrayList<>();
		l.add(12);
		l.add(12.4f);
		l.add(1283475983L);
		
		List<Box<Integer>> b = new ArrayList<>();
		b.add(new Box(List.of(1,2,3)));
		b.add(new Squarebox<>(List.of(4,5,6)));
	}
}
