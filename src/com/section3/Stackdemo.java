package com.section3;

import java.util.ArrayList;

public class Stackdemo {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>(new ArrayList<>());

		st.push(15);
		st.push(16);
		st.push(17);

		System.out.println(st);

		st.pull();
		st.pull();
		st.pull();
		st.pull();
	}
}
