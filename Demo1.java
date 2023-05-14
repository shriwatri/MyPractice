package com.shriwatri;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("HashMap iteration Demo");
		System.out.println("==================================");
		HashMap<String, String> hm = new HashMap<>();
		hm.put("Ashish", "Shriwatri");
		hm.put("Anupam", "Shriwatri");
		hm.put("Prisha", "Shriwatri");
		hm.put("Yashashvee", "Shriwatri");
		hm.put("Amit", "Kumar");
		hm.put("Shiv", "Shankar");
		hm.put("Pradeep Rao", "Kochale");
		hm.put("Dinesh", "Patel");
		
		System.out.println("Name with hm.keySet()");
		System.out.println("==================================");
		for(String name:hm.keySet()) {
			System.out.println(name );			
		}
		System.out.println("==================================");
		System.out.println("Name with hm.values()");
		System.out.println("==================================");
		for(String surName:hm.values()) {
			System.out.println(surName );			
		}
		System.out.println("==================================");
		System.out.println("Name with hm.entrySet");
		System.out.println("==================================");
		for(Map.Entry<String, String> entry:hm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue() );			
		}
		System.out.println("==================================");
		

	}

}
