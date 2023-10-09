package com.shriwatri;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringListWithStream {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Banana","Apple","Cherry","Dates","Grapes");
		List<String> sortedList = words.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List:"+sortedList);

	}

}
