package com.section2;

interface IInterface<T> {
}

interface IInterface2 {
}

class Class2<T> implements IInterface<T> {
}

public class Class1<T> extends Class2<T> implements IInterface<T> {
	
}
