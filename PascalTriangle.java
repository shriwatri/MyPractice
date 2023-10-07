package com.shriwatri;

import java.util.Iterator;
import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		System.out.println("Enter number of line.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int spaces = input;
		int number = 1;
		for (int i = 0; i <= input; i++) {
			//Nested loop for spaces
			for(int s=1; s<=spaces;s++) {
				System.out.print(" ");
				
			}
			 	
			number=1;
			for (int j = 0; j<=i; j++) {
				System.out.print(number+" ");
				number = number * (i-j)/(j+1);
				
			}
			spaces--;
			System.out.println();
			
			
		}
		
	}

}
