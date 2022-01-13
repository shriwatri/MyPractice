import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number for factorial");
		int num = scn.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of number "+num+" is:"+fact);

	}

}
