package com.shriwatri;

import java.util.Iterator;

public class PalindromWordsOfInputSentance {

	public static void main(String[] args) {
		String input ="My name is nitin and I can speak malayalam";
		String[] words = input.split(" ");
		for(String word : words) {
			if(isPalindrome(word)) {
				System.out.println(word+" is Palindrome");
			}
		}

	}
	
	public static boolean isPalindrome(String input) {
		int start = 0;
		int end = input.length()-1;
		while(end > start) {
			if(input.charAt(start) != input.charAt(end)) {
				return false;
			}
			start++;
			end--;
			
		}
		return true;
	}

}
