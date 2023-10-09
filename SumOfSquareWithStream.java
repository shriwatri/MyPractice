package com.shriwatri;

import java.util.Arrays;
import java.util.List;

/*
 * Find sum of squares from List using Java 8
 * 
 * Input: 1,2,3,4,5
 * Output: Sum of squares: 55
 */

public class SumOfSquareWithStream {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		int sumOfSquare = numbers.stream()
				.mapToInt(n -> n*n).sum();
		System.out.println("Sum of Square: "+sumOfSquare);

	}

}
