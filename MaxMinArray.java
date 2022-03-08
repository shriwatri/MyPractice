import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		int n, min, max;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of element in array");
		n = scn.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the "+ n +" array element");
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}
		max = a[0];
		min = a[0];
		// Maximum logic
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
				
			
		}
		// Minimum logic
		for (int i = 0; i < n; i++) {
			if (a[i] < min) {	
			min = a[i];
			}
		}
		System.out.println("Minimum value is "+min+ " and maximaum value "+max);
	}
	

}
