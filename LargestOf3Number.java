import java.util.Scanner;

public class LargestOf3Number {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Plese enter the first number:");
		int a = scn.nextInt();
		System.out.println("Plese enter the second number:");
		int b = scn.nextInt();
		System.out.println("Plese enter the third number:");
		int c = scn.nextInt();
		//Approach 1
		/*
		if(a > b && a > c) {
			System.out.println(a + " is a largest number.");
			
		}else if (b>a && b >c) {
			System.out.println(b + " is largest number.");
		}else {
			System.out.println(c + " is largest number.");
		}
		*/
		
		/*
		int largest1 = a > b ? a : b;
		int largest2 = c > largest1 ? c : largest1;
		System.out.println(largest2 + " is largest number.");
		*/
		int largest = c > (a>b?a:b)? c : (a>b?a:b);
		System.out.println(largest + " is largest number.");
		
		
	}

}
