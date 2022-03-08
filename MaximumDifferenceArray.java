import java.util.Scanner;

public class MaximumDifferenceArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of element in array:");
		int n, min, max;
		n = scn.nextInt();
		System.out.println("Enter the " + n + " elements in array.");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}
		min = a[0];
		max = a[0];
		// max logic
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		// minimum logic
		for (int i = 0; i < n; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("MAX element:" + max);
		System.out.println("Min element:" + min);
		System.out.println("Max difference in array:" + (max - min));

	}

}
