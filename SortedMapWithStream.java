package com.shriwatri;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedMapWithStream {

	public static void main(String[] args) {
		Map<String,Integer> input = new HashMap<>();
		input.put("Ashish", 5);
		input.put("Anupam", 2);
		input.put("Prisha", 3);
		input.put("Yashashvee", 4);
		System.out.println("Before Sorting");
		System.out.println(input);
		LinkedHashMap<String, Integer> sortedMap =
		input.entrySet().stream().sorted((e1, e2) -> {
			return e2.getValue()-e1.getValue();
		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
				(e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("After Sorting");
		System.out.println(sortedMap);		

	}

}
