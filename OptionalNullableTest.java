package com.shriwatri;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalNullableTest {
	
	private static Map<String, Student> empMap = new HashMap<>();
	
	private static Map<String, Student> initMap(){
		empMap.put("TCS", new Student(101, "Ashish", "ak.shriwatri@gmail.com"));
		empMap.put("Wipro", new Student(102, "Anupam", "anupam.shriwatri@gmail.com"));
		empMap.put("Harman", new Student(102, "Prish", "prisha.shriwatri@gmail.com"));
		empMap.put("Google", new Student(102, "Yashashvee", "yashvi.shriwatri@gmail.com"));
		empMap.put("Amazon", new Student(102, "Moksh", "prisha.shriwatri@gmail.com"));
		return empMap;
	}

	public static void main(String[] args) {
		empMap = initMap();
		String[] strArray = {"TCS","INFY","Wipro","Harman","Google","Microsoft","Amazon","Cognizant"};
		Arrays.stream(strArray).forEach(str -> Optional.ofNullable(empMap.get(str))
				.ifPresent(emp -> System.out.println(emp))
				);
		

	}

}
