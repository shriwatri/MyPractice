import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number for which you want fabonacci series:");
		int input = scn.nextInt();
		int n1 = 0, n2 = 1, sum = 0;
		System.out.print(n1 + " " + n2);

		for (int i = 2; i < input; i++) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
		}
	}
}
