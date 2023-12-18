package com.optionaldemo;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Optionaldemo {

	public static Optional<String> getStudentNameOptional(Student student) {

		String name = student.getName();

		return Optional.ofNullable(Optional.ofNullable(name).orElse("None"));

	}

	public static String optionalOrElse() {

		Optional<Student> s = Optional.ofNullable(null);

		String name = s.map(Student::getName).orElseGet(() -> "Default");
		return name;

	}

	public static String optionalOrElseThrow() {

		Optional<Student> s = Optional.ofNullable(null);
		String name = s.map(Student::getName).orElseThrow(() -> new RuntimeException("No such data"));
		return name;

	}

	public static void main(String[] args) {

		Optional<String> min = Stream.of("deer", "horse", "pig").min((s2, s3) -> s2.length() - s3.length());
		System.out.println("Min length :" + min.get());

		Optional<Integer> max = Stream.of(4, 7, 9).max((s2, s4) -> s2 - s4);
		max.ifPresent(System.out::println);
		
		OptionalDouble doubleres= DoubleStream.of(17,10,80).max();
		System.out.println(doubleres.orElse(0.0));
		
		OptionalInt intRes = IntStream.of(6,5,2).filter(x -> x%2==0).findFirst();
		System.out.println(intRes.orElse(0));

		System.out.println(getStudentNameOptional(new Student("Niki", "Pune")));
		System.out.println(optionalOrElse());

		Optional<String> s4 = Optional.ofNullable("Ki");
		System.out.println("Using ofNullable :" + s4);
		System.out.println("Is present:" + s4.isPresent());
		
		OptionalDouble optAvg = IntStream.rangeClosed(1, 6).average();
		optAvg.ifPresent(d -> System.out.println(d));
		System.out.println(optAvg.getAsDouble());
		System.out.println(optAvg.orElseGet(() -> Double.NaN));

		Optional<Student> s3 = Optional.ofNullable(null);
		System.out.println("Using ofNullable null:" + s3);

		Optional<Student> s = Optional.empty();
		System.out.println("Using empty: " + s.get());

		Optional<String> s1 = Optional.of("Nii");
		System.out.println("Using of :" + s1.get());

		System.out.println(optionalOrElseThrow());

		Optional<String> s2 = Optional.of(null);
		System.out.println("Using of null value :" + s2.get());

	}

}
