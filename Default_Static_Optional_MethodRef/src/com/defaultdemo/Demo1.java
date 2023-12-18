package com.defaultdemo;

public interface Demo1 {

	default void m5() {
		System.out.println("Demo1:: m1");
	}

	default void m2() {
		System.out.println("Demo1:: m2");
	}

}
