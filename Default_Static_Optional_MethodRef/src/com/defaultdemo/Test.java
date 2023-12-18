package com.defaultdemo;

public class Test implements Demo1, Demo2 {

	public void m5() {

		System.out.println("Test :: m5");
	}

	@Override
	public void m2() {
		Demo2.super.m2();
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.m5();
		Demo1 t1 = new Test();
		t1.m5();
		t.m2();
		t1.m2();

	}

}
