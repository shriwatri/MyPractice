package com.shriwatri;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElementWithStream {

	public static void main(String[] args) {
		List<String> input = Arrays.asList("Ashish","Yashasvee","Prisha","Anupam");
		String subStringToRemove = "an";
		List<String> filterdList = input.stream()
				.filter(output -> input.contains(subStringToRemove))
				.collect(Collectors.toList());
		System.out.println(filterdList);

	}

}
