package com.shriwatri;

import java.util.Iterator;

public class ReverseStringDemo {

	public static void main(String[] args) {
		String revStr =reverse("Ashish");		
		System.out.println("Your reverse String: "+revStr);

	}

	private static String reverse(String input) {
		System.out.println("Your input String: "+ input);
		char[] letters = new char[input.length()];
		int letterIndex =0;
		for (int i = input.length()-1; i >=0 ; i--) {
			letters[letterIndex] = input.charAt(i);
			letterIndex++;			
		}
		
		String reverse = "";
		for (int i = 0; i < letters.length; i++) {
			reverse = reverse+letters[i];
		}
		return reverse;
		
	}

}
