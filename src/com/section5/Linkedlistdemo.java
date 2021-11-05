package com.section5;

public class Linkedlistdemo {

	public static void main(String[] args) {
		Datanode<String> dn4 = new Datanode<>("Monthy", null);
		Datanode<String> dn3 = new Datanode<>("Python", null);
		Datanode<Integer> dn2 = new Datanode<>(35, null);
		Datanode<Integer> dn1 = new Datanode<>(20, dn2);

		System.out.println(dn1);
		System.out.println(dn2);
		System.out.println(dn3);
		System.out.println(dn4);
	}
}