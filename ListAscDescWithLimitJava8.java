package com.shriwatri;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListAscDescWithLimitJava8 {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> outputListAsc = input.stream()
				.limit(5) //Limit to the 5 first element 
				.collect(Collectors.toList());
		List<Integer> descOutPutList = input.stream()
				.skip(5) //skip the 5 first element
				.sorted((a,b) -> Integer.compare(b, a)) //sort in descending order
				.collect(Collectors.toList());
		
		
		outputListAsc.addAll(descOutPutList);
		System.out.println(outputListAsc);

	}

}
