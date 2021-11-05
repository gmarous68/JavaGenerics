package com.section4;

import java.util.List;

public class Box {
	private List a;

	public <T> Box(List<T> a) {
		super();
		this.a = a;
	}

	public List getA() {
		return a;
	}

	public void setA(List a) {
		this.a = a;
	}
}
