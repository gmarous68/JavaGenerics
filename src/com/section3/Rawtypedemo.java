package com.section3;

import java.util.List;

public class Rawtypedemo {

	public static void main(String[] args) {
		Box<Integer> genBox = new Box<>(List.of(1,2,3));
		
		for(int x : genBox.getA())
			System.out.print(x + " ");
		
		System.out.println();
		
		Box rawBox = new Box(List.of(4,5,"Test"));
		
			for(Object x : rawBox.getA())
				System.out.print(x + " ");
	}
}
