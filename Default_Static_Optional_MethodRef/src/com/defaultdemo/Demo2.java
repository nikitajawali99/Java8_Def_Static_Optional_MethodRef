package com.defaultdemo;

public interface Demo2 {

	default void m1() {
		System.out.println("Demo2:: m1");
	}

	default void m2() {
		System.out.println("Demo2:: m2");
	}

}
