package com.methodReference;

interface Show {
	void m5(int a, int b);
}

interface Print {
	void say();
}

public class MethodRef2 {

	public void m2(int a, int b) {
		System.out.println("Add:" + (a + b));
	}

	void saySomething() {
		System.out.println("In saySomething ::");
	}

	public static void main(String[] args) {

		MethodRef2 m = new MethodRef2();
		m.m2(20, 10);
		Print p = m::saySomething;
		p.say();

	}

}
