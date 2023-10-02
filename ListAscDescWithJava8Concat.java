package com.shriwatri;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListAscDescWithJava8Concat {

	public static void main(String[] args) {
		List<Integer> inputList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> outputList = Stream.concat(
				inputList.stream().limit(5), //First 5 element
				inputList.stream().skip(5)
				.sorted(Collections.reverseOrder())				
				).collect(Collectors.toList());
		System.out.println(outputList);

	}

}
