package com.section2;

public class Demo {

	public static void main(String[] args) {
		Data<String> data = new Data<>("This is d1");		
		System.out.println(data);
		
		Data<Integer> data2 = new Data<>(10);
		System.out.println(data2);
		
		IData<String> d3 = new Data<>("We have implemented a generic interface");
		System.out.println(d3);
		
		Data<String> d4 = new Data<>("Data 4");
		BaseData<String> b1 = d4;
		System.out.println(b1);
	}
}
