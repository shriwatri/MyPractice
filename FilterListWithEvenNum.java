package com.shriwatri;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterListWithEvenNum {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 19);
		List<Integer> output = input.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(output);

	}

}
