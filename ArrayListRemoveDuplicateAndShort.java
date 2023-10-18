package com.shriwatri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListRemoveDuplicateAndShort {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		System.out.println("Enter 5 integer numbers");
		Scanner scan = new Scanner(System.in);
		for(int i=0; i < 5; i++) {
			int temp = scan.nextInt();
			if(!integers.contains(temp)) {
				integers.add(temp);
			}
		}
		Collections.sort(integers);
		System.out.println(integers);

	}

}
