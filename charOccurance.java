package com.shriwatri;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class charOccurance {

	public static void main(String[] args) {
		String input ="wellcometoindia";
		Map<String, Long> map = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
				}
	

}
