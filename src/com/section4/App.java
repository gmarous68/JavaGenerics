package com.section4;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[] { 2, 8, 9, 5 });
		List<String> list2 = Arrays.asList(new String[] { "g", "a", "r", "p" });
		List<Double> list3 = Arrays.asList(new Double[] { 2.3, 8.5, 9.7, 5.8 });

		DataSorter<Integer> ds = new DataSorter<>(list);
		DataSorter<String> ds2 = new DataSorter<>(list2);
		DataSorter<Double> ds3 = new DataSorter<>(list3);;
			
		getSortedData(list);
		System.out.println();
		ds2.getSortedData();
		System.out.println();
		getSortedData(list3);		
	}	
	
	public static <T extends Number> void getSortedData(List<T> list) {
		list.sort(null);
		
		for(T t : list)
			System.out.print(t + " * ");
	}
}