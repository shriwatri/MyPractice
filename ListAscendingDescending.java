package com.shriwatri;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListAscendingDescending {

	public static void main(String[] args) {
		List<Integer> ascending = IntStream.rangeClosed(1, 5)
				.boxed()
				.collect(Collectors.toList());
		List<Integer> descending = IntStream.rangeClosed(6, 10)
				.boxed()
				//.map(i -> 11 - i) // 11-6 5 11-7
				.collect(Collectors.toList());
		ascending.addAll(descending);
		System.out.println(ascending);
		 List<Integer> combined = new ArrayList<>();
	        combined.addAll(ascending);
	        combined.addAll(descending);
		
		String result = combined.stream()
				.map(Object::toString)
				.collect(Collectors.joining(","));
		System.out.println(result);

	}

}
