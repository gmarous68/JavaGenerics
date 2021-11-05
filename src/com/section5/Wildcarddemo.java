package com.section5;

import java.util.ArrayList;
import java.util.List;

public class Wildcarddemo {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(34);
		list1.add(57);
		
		List<Number> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);

		displayData(list1);
		System.out.println();
		displayData(list2);
	}

	public static <T> void displayData(List<? super Integer> list) {
		for (Object t : list)
			System.out.print(t + " ");
	}
}