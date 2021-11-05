package com.section2;

class BaseData<T> {
	
}

public class Data<T> extends BaseData<T> implements IData<T> {
	private T data;

	public Data(T data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data: " + data;
	}

	@Override
	public T getData() {
		return data;
	}

	@Override
	public void setData(T data) {
		this.data = data;
	}
}
