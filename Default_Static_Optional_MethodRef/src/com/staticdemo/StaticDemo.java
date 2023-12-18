package com.staticdemo;

public class StaticDemo implements Interf {

	public static void m1() {
		System.out.println("Inside StaticDemo m1");
	}

	public static void m2() {
		System.out.println("Inside StaticDemo m2");
	}

	public static void main(String[] args) {
		Interf.m1();
		StaticDemo.m1();
		StaticDemo.m2();

	}

}
