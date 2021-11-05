package com.section4;

import java.util.List;

public class DataSorter<T extends Object> {
	private List<T> list;

	public DataSorter(List<T> list) {
		super();
		this.list = list;
	}

	public void getSortedData() {
		list.sort(null);

		for (T t : list)
			System.out.print(t + " ");
	}
}
