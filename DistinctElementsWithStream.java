package com.shriwatri;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElementsWithStream {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1,2,3,4,4,1,5,3,6,6,2,2);
		List<Integer> distinctList=input.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctList);
		
		input.stream().distinct().collect(Collectors.toList()).forEach(System.out::println); 
		
		input.stream().distinct().collect(Collectors.toList()).forEach(num -> System.out.print(num));
		

	}

}
