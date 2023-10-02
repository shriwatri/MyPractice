package com.shriwatri;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListAscDescWithSortJava8 {

	public static void main(String[] args) {
		List<Integer> ascending = IntStream.rangeClosed(1, 5)
				.boxed()
				.collect(Collectors.toList());
		List<Integer> descending = IntStream.rangeClosed(6, 10)
				.boxed()
				.collect(Collectors.toList());
		Collections.reverse(descending);
		ascending.addAll(descending);
		System.out.println(ascending);
		String result = ascending.stream()
				.map(Object::toString)
				.collect(Collectors.joining("*"));
		System.out.println(result);

	}

}
