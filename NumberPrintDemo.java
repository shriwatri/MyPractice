import java.util.Scanner;

public class NumberPrintDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int num=scn.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("The number is = "+i);
		}

	}

}
