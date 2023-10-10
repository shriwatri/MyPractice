package com.shriwatri;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListElemetWithStream {

	public static void main(String[] args) {
		List<String> input = Arrays.asList("Raj","Tapan","Vikrant","Dean");
		String finalString =input.stream().collect(Collectors.joining("->"));
		System.out.println(finalString);

	}

}
