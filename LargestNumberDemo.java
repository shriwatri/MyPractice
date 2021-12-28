import java.util.Scanner;

public class LargestNumberDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first Number:");
		int num1=scn.nextInt();
		System.out.println("Enter Second Number:");
		int num2=scn.nextInt();
		System.out.println("Enter 3rd Number:");
		int num3=scn.nextInt();
		if(num1 > num2 && num1 > num3) {
			System.out.println("First number is largest number: "+num1);
		}else if(num2 > num3 && num2 > num1) {
			System.out.println("2nd number is largest number: "+num2);
		}else if(num3 > num1 && num3 > num2) {
			System.out.println("Number 3 is largest number: "+ num3);
		}else {
			System.out.println("All numbers are equals.");
		}
	}

}
