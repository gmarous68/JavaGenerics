package com.section5;

public class Datanode<E> {
	private E data;
	private Datanode<? extends Number> next;

	public Datanode(E data, Datanode<? extends Number> next) {
		super();
		this.data = data;
		this.next = next;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Datanode<?> getNext() {
		return next;
	}

	public void setNext(Datanode<? extends Number> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Datanode [data=" + data + ", next=" + next + "]";
	}
}