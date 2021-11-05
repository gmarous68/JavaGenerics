package com.section3;

import java.util.ArrayList;

public class Collectiondemo {

	public static void main(String[] args) {
		ArrayList<String> arrL = new ArrayList<>();
		
		arrL.add("John");
		arrL.add("1");
		
		for(String x : arrL) {
			System.out.println(x);
		}
	}

}
