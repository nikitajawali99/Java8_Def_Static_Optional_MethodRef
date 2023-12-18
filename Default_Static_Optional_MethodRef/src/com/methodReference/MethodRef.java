package com.methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodRef implements Interf {

	public MethodRef() {
		super();
		System.out.println("Inside MethodRef constructor");
	}

	public static void m2() {
		System.out.println("Inside static m2::");
	}

	public void m3() {
		System.out.println("Inside non-static m3::");
	}

	public static void main(String[] args) {

		Interf i1 = MethodRef::m2;
		i1.m1();
		Interf i2 = MethodRef::new;
		i2.m1();

		List<String> personList = new ArrayList<>();
		personList.add("vicky");
		personList.add("pooname");
		personList.add("asachin");
		Collections.sort(personList, String::compareToIgnoreCase);

		personList.forEach(System.out::println);

	}

	@Override
	public void m1() {
		System.out.println("Inside non-static m1::");
	}

}
