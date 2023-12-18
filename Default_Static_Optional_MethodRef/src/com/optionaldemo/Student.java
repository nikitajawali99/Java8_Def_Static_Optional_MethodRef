package com.optionaldemo;

public class Student {

	private String name;
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Student(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
