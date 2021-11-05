package com.section4;

public class GenericMethod {

	public static void main(String[] args) {
		System.out.println(concat(10));		
	}
	
	public static <T> String concat(T data) {
		return "Data is: " + data;
	}
}
