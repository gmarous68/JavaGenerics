package com.section3;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
	private List<T> list;

	public Stack(List<T> list) {
		super();
		this.list = new ArrayList<>();
	}

	public void push(T item) {
		list.add(item);
	}

	public void pull() {
		if (isEmpty())
			System.out.println("List is empty!");
		else
			list.remove(0);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return "Stack [list=" + list + "]";
	}
}
