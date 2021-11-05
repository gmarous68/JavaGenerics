package com.section3;

public class Collectiondemo2 {
	public static void main(String[] args) {
		
		Bin<Integer, String> bin = new Bin<>(1, "Test1");		
		
		System.out.println(bin.getKey() + " " + bin.getValue());
	}
}