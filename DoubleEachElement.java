package com.shriwatri;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleEachElement {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4,5);
		List<Integer> doubledElements = numbers.stream()
				.map(n -> n*2)
				.collect(Collectors.toList());
		System.out.println("Doubled Elements:"+ doubledElements);
	/*	System.out.println("With for each:");
		numbers.stream()
		.map(n -> n*2)
		.collect(Collectors.toList()).forEach(num ->System.out.println(num)); */
		System.out.println("With for each :: :");
		numbers.stream()
		.map(n -> n*2)
		.collect(Collectors.toList()).forEach(System.out::println);

	}

}
